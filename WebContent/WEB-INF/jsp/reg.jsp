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
      <div class="login_l_img"><img   src="img/reg.jpg" /></div>
      <a href="/personal">返回登陆</a>
          <form action="reg" method="post">
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
</body>


</html>