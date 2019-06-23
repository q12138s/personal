<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>欢迎登陆</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="css/public.css" type="text/css" media="screen" />
    <link href="css/css.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
    <link href="css/login.css" rel="stylesheet" type="text/css" />
</head>

<body>
    <div class="login_box">
      <div class="login_l_img"><img src="images/login-img.png" /></div>
      <div class="login">
          <div class="login_logo"><a href="#"><img src="images/login_logo.png" /></a>
          <p><a href="userreg">注册</a></p>
          </div>
          <div class="login_name">
               <p>个人备忘录管理系统</p>
          </div>
          <form action="login" method="post">
              <input name="username" type="text"  value="用户名" onfocus="this.value=''" onblur="if(this.value==''){this.value='用户名'}">
              <span id="password_text" onclick="this.style.display='none';document.getElementById('password').style.display='block';document.getElementById('password').focus().select();" >密码</span>
			<input name="password" type="password" id="password" style="display:none;" onblur="if(this.value==''){document.getElementById('password_text').style.display='block';this.style.display='none'};"/>
			  <input value="登录" style="width:100%;" type="submit">
          </form>
      </div>
</div>
</body>


</html>