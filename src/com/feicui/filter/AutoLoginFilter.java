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
 * filter:������ ÿһ����������Ӧ��ʵ��filter�ӿ� ����ʹ�ù������������е�����
 * 			�����������֤,�������Ϸ������У�������Ϸ�����������
 * 
 * Ȩ�޵Ŀ��ƣ���½��֤����־
 * 
 */
public class AutoLoginFilter implements Filter {

	private UsersMapper userMapper;

	

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// ��֤����
		System.out.println("���ص��û�������");
		// ����ת��
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		// ��ȡ�û�������·��
		String uri = request.getRequestURI();
		System.out.println(uri);
		String contextPath = request.getContextPath();
		System.out.println(contextPath);

		// ���ڵ�½������ע���������Ҫ�Զ���¼
		if (uri.indexOf("login") == -1 && uri.indexOf("Login") == -1 && uri.indexOf("reg") == -1
				&& uri.indexOf("Reg") == -1) {

			// ��ȡsession
			HttpSession session = request.getSession();

			// ��ȡsession�е�½���û�����
			Users users = (Users) session.getAttribute("user");
			System.out.println(users);

			// �ж��û��Ƿ��½
			// ���usersΪnull��˵��û�е�¼
			if (users == null) {
				// �Զ���¼
				//��ȡ���е�cookie
				Cookie[] cookies = request.getCookies();
				//��ȡ��Ҫʹ�õ�cookie:autoLogin
				Cookie cookie = CookieUtils.getCookie(cookies, "autoLogin");
				//���cookie������null,˵�����ڵ�½�û���Ϣ
				if (cookie != null) {
					//��ȡcookie�д�ŵ��û���Ϣ
					String autoLogin = cookie.getValue();
					// �ж�cookie�Ƿ����û���Ϣ�������
					if (autoLogin != null && !autoLogin.equals("")) {
						System.out.println("�Զ���¼");
						//�û���-����
						//��-Ϊ�ָ����ȡ�û����û���������
						String[] names = autoLogin.split("-");
						
						//����¼��Ϣ��װ��������
						Users user = new Users();
						user.setUsername(URLDecoder.decode(names[0], "utf-8"));
						user.setPassword(names[1]);

						// ����userMapper���е�¼
						Users users2 = userMapper.login(user);

						// ����½�Ķ����ŵ�session��
						session.setAttribute("user", users2);
					}
				}else{
					
					//�����������붩��������Ҫ���û������¼
					if(uri.contains("order") || uri.contains("Order")){
						System.err.println("orderҳ��");
						//��ת����½ҳ��
						//�ض���
						response.sendRedirect("showLogin?type=3");
						return;
						//����ת��
						//request.getRequestDispatcher("").forward(request, response);
						//forward��Redirect������
					}
					
					
					
				}
				
			}
		}
		// ����
		chain.doFilter(req, resp);
	}

	//�ڴ�������ʱ�Զ��ĵ���init�����Զ����ʼ��
	@Override
	public void init(FilterConfig config) throws ServletException {
		//��ȡspring����
		
		//ServletContext:��������webӦ��
		
		ServletContext context = config.getServletContext();
		
		
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(context);
		System.out.println(ac);
		userMapper = ac.getBean(UsersMapper.class);
	}
	
	//�ڶ�������ʱ���÷���
	@Override
	public void destroy() {

	}

}
