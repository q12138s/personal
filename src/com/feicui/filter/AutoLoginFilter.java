package com.feicui.filter;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.feicui.dao.UsersMapper;
import com.feicui.model.Users;
import com.feicui.service.UsersService;
import com.feicui.service.impl.UsersServiceImpl;
import com.feicui.utils.CookieUtils;

/**
 * filter:过滤器 每一个过滤器类应该实现filter接口 可以使用过滤器拦截所有的请求，
 * 			对请求进行验证,如果请求合法，放行，如果不合法，进行拦截
 * 
 * 权限的控制，登陆认证，日志
 * 
 */
public class AutoLoginFilter implements Filter {

	private UsersMapper userMapper;

	

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// 验证代码
		System.out.println("拦截到用户的请求");
		// 向下转型
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		// 获取用户的请求路径
		String uri = request.getRequestURI();
		System.out.println(uri);
		String contextPath = request.getContextPath();
		System.out.println(contextPath);

		// 对于登陆的请求，注册的请求不需要自动登录
		if (uri.indexOf("login") == -1 && uri.indexOf("Login") == -1 && uri.indexOf("reg") == -1
				&& uri.indexOf("Reg") == -1) {

			// 获取session
			HttpSession session = request.getSession();

			// 获取session中登陆的用户对象
			Users users = (Users) session.getAttribute("user");
			System.out.println(users);

			// 判断用户是否登陆
			// 如果users为null，说明没有登录
			if (users == null) {
				// 自动登录
				//获取所有的cookie
				Cookie[] cookies = request.getCookies();
				//获取需要使用的cookie:autoLogin
				Cookie cookie = CookieUtils.getCookie(cookies, "autoLogin");
				//如果cookie不等于null,说明存在登陆用户信息
				if (cookie != null) {
					//获取cookie中存放的用户信息
					String autoLogin = cookie.getValue();
					// 判断cookie是否有用户信息，如果有
					if (autoLogin != null && !autoLogin.equals("")) {
						System.out.println("自动登录");
						//用户名-密码
						//以-为分割符获取用户的用户名和密码
						String[] names = autoLogin.split("-");
						
						//将登录信息封装到对象中
						Users user = new Users();
						user.setUsername(URLDecoder.decode(names[0], "utf-8"));
						user.setPassword(names[1]);

						// 调用userMapper进行登录
						Users users2 = userMapper.login(user);

						// 将登陆的对象存放到session中
						session.setAttribute("user", users2);
					}
				}else{
					
					//如果请求的是与订单的请求，要求用户必须登录
					if(uri.contains("order") || uri.contains("Order")){
						System.err.println("order页面");
						//跳转到登陆页面
						//重定向
						response.sendRedirect("showLogin?type=3");
						return;
						//请求转发
						//request.getRequestDispatcher("").forward(request, response);
						//forward与Redirect的区别
					}
					
					
					
				}
				
			}
		}
		// 放行
		chain.doFilter(req, resp);
	}

	//在创建对象时自动的调用init方法对对象初始化
	@Override
	public void init(FilterConfig config) throws ServletException {
		//获取spring容器
		
		//ServletContext:代表整个web应用
		
		ServletContext context = config.getServletContext();
		
		
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(context);
		System.out.println(ac);
		userMapper = ac.getBean(UsersMapper.class);
	}
	
	//在对象被销毁时调用方法
	@Override
	public void destroy() {

	}

}
