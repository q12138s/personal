<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>欢迎注册</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="css/public.css" type="text/css" media="screen" />
    <link href="css/css.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
</head>

<body>
    <div class="topbar">
        <div class="topbar_content">
            <div class="topbar_content_left">
                欢迎光临Estore图书商城
            </div>
            <div class="topbar_content_right">
                <ul>
                  <c:if test="${empty user }">
	                    <li>
	                        <a href="${pageContext.request.contextPath}/showLogin" style="color:rgb(241, 187, 10)">亲，请登录</a>
	                    </li>
	                    <li>
                        	<a href="${pageContext.request.contextPath}/showReg" style="color: rgb(241, 187, 10)">免费注册</a>
                   		</li>
                	</c:if>
                	<c:if test="${!empty user}">
	                    <li>
	                        <a href="#" style="color:rgb(241, 187, 10)">${user.nickname}</a>
	                    </li>
	                     <li>
	                        <a href="${pageContext.request.contextPath}/logout" style="color:rgb(241, 187, 10)">退出登录</a>
	                    </li>
                	</c:if>
                    <li>
                        <a href="${pageContext.request.contextPath}/showIndex">首页</a>
                    </li>
                    <li>|</li>
                    <li>
                        <a href="${pageContext.request.contextPath}/showCart">购物车</a>
                    </li>
                    <li>|</li>
                    <li>
                        <a href="${pageContext.request.contextPath}/showOrders">我的订单</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="estore_content" style="min-height: 800px;">
            <div class="header">
                <div class="header_png"></div>
                <div class="estore" align="center">
                        <h1 style="font-size:35px;text-align:center;padding-top:80px;color: #87520E;">Estore
                                <br/>图书商城
                        </h1>
                   
                </div>
            </div>
            <form action="reg.action" method="post" onsubmit="return check()" id="registform">
            
                <input type="hidden" name="method" value="regist">
                <!-- 我们当前是一个注册操作 -->
                <table>
                    <tr>
                        <td>用户名:</td>
                        <td>
                            <input type="text" name="username" id="username" onblur="checkName()" required="required">
                            <span id="username_span"></span>
                        </td>
                    </tr>
    
    
                    <tr>
                        <td>密码:</td>
                        <td>
                            <input type="password" name="password" id="password">
                            <span id="password_span"></span>
                        </td>
                    </tr>
    
                    <tr>
                        <td>确认密码:&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td>
                            <input type="password" name="repassword" id="repassword">
                            <span id="repassword_span"></span>
                        </td>
                    </tr>
    
                    <tr>
                        <td>昵称:</td>
                        <td>
                            <input type="text" name="nickname" id="nickname">
                            <span id="nickname_span"></span>
                        </td>
                    </tr>
    
                    <tr>
                        <td>邮箱:</td>
                        <td>
                            <input type="text" name="email" id="email" required="required" onblur="checkEmail()">
                            <span id="email_span"></span>
                        </td>
                    </tr>
    
                    <tr>
                        <td>验证码:</td>
                        <td>
                            <input type="text" name="checkcode" id="checkcode">
                            <img src='checkImg' id="im" onclick="change()">
                            <span id="checkcode_span">
                            </span>
                            <br/>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>
                            <input type="submit" value="注册" style="color:white;background:#87520E;font-size:20px;cursor:pointer">&nbsp;&nbsp;
                            <a href="javascript:void(0)" onclick="change();">
                                <font style="font-size:15px;color:red;">&nbsp;看不清，换一张</font>
                            </a>
                            <br/><font color="red">${msg }</font>
                        </td>
    
    
    
    
                    </tr>
    
                </table>
            </form>
    </div>

    
        <div id="color">
            <h1>&nbsp;</h1>
            <h2>&nbsp;</h2>
            <h3>&nbsp;</h3>
            <h4>&nbsp;</h4>
            <h5>&nbsp;</h5>
            <span>&nbsp;</span>
            <h6>&nbsp;</h6>
            <blockquote>&nbsp;</blockquote>
            <font>&nbsp;</font>
            <div>&nbsp; </div>
        </div>
    </div>
  
    <div class="footer1">
            <p align="center">
                总部地址:北京市海淀区小南庄怡秀园甲一号亿德大厦10层 电话：010-61943240
            </p>
            <p align="center"> Copyright © 2005-2020 北京翡翠教育科技有限公司，All Rights Reserved 京ICP备12036804号-23</p>
        </div>
	<script type="text/javascript">
	
		//改变验证码的函数
		function change() {
			//htmldom:js操作html标签的方式
			//获取到验证码img标签
			var obj = document.getElementById("im");
		
		
			//改变验证码img的src路径
			obj.src = "${pageContext.request.contextPath}/checkImg?date=" + new Date();
		}
		
		//对用户名校验是否存在
		function checkName() {
			var f = false;
			//javascript所有的变量都是以var定义的
			//javascript的变量属于弱类型
			
			//1.获取用户输入的用户名
			var name = document.getElementById("username").value;
			
			//去除字符串两端空格
			name = name.trim();
			//判断是否为空
			if(name == ""){
				document.getElementById("username_span").innerHTML = "用户名不能为空";
				f = false;
			}
			else if(name.length<6 || name.length>16){
				document.getElementById("username_span").innerHTML = "用户名的长度为6到16位";
			}
			else{
				document.getElementById("username_span").innerHTML = "";
				//校验用户名是否存在
				//使用ajax异步校验用户名
				$.ajax({
					url:"/bookshopping/checkName",
					type:"post",
					data:{"username":name},
					dataType:"json",
					async:false,
					success:function(data){
						if(data.msg == "false"){
							document.getElementById("username_span").innerHTML = "用户名已存在";
							f = false;
							
						}else{
							document.getElementById("username_span").innerHTML = "用户名可注册";
							f = true;
							
						}
					}
				});
			}
			return f;
		}
	
		function check(){
			var name = checkName();
			var mail = checkEmail();
			if(name && mail){
				return true;
			}
			return false;
		}
		
		
		function checkEmail(){
			var mail = document.getElementById("email").value;
			//var reg = new RegExp("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*\.[a-zA-Z0-9]{2,6}$");
			var reg = /^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*\.[a-zA-Z0-9]{2,6}$/;
			var f = reg.test(mail)
			if(f == false){
				document.getElementById("email_span").innerHTML = "邮箱格式错误";
				return false;
				
			}else{
				document.getElementById("email_span").innerHTML = "";
				return true;
			}
		}
	</script>



</body>


</html>