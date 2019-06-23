<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>教材管理系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/public.css">
    <script type="text/javascript" src = "${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<h3>即将跳转到首页，如果
<span id="jumpTo">5</span>秒后不自动跳转，可点击链接返回</h3><br>
<a href="${pageContext.request.contextPath}">返回登录</a>

<script type="text/javascript">
$(function() {
		alert("您的权限不够，禁止访问！")
});

function countDown(secs,surl){        
	 var jumpTo = document.getElementById('jumpTo');
	 jumpTo.innerHTML=secs;  
	 if(--secs>0){
	     setTimeout("countDown("+secs+",'"+surl+"')",1000);     
	     }
	 else{
	     location.href=surl;     
	     }
	 }
	countDown(5,'${pageContext.request.contextPath}');

</script>

</body>
</html>