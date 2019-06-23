<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>商品修改</title>
<meta name="keywords" content="">
<meta name="description" content="">
<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
<link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
<link href="css/plugins/iCheck/custom.css" rel="stylesheet">
<link href="css/animate.min.css" rel="stylesheet">
<link href="css/style.min.css?v=4.0.0" rel="stylesheet">
<script src="js/jquery.min.js?v=2.1.4"></script>

<script src="js/content.min.js?v=1.0.0"></script>
<script src="js/plugins/iCheck/icheck.min.js"></script>
<script src="js/plugins/validate/jquery.validate.min.js"></script>
<script src="js/plugins/validate/messages_zh.min.js"></script>
<script src="js/plugins/layer/layer.js"></script>
</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>
							用户管理 <small>用户修改</small>
						</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<form method="post" class="form-horizontal" id="addGoodsForm"
							action="${pageContext.request.contextPath }/updateuser"
							enctype="multipart/form-data">
							<!-- 商品名称输入框 -->
							<div class="form-group">
							<input type="hidden" name="id" value = "${user.id }"/>
								<label class="col-sm-2 control-label">账号</label>
								<div class="col-sm-4">
									<input id="username" name="username" type="text" value="${user.username}"
										class="form-control"> <br />
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">密码</label>
								<div class="col-sm-4">
									<input id="password" name="password" type="text" value="${user.password}"
										class="form-control"> <br />
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">用户名</label>
								<div class="col-sm-4">
									<input id="nickname" name="nickname" type="text" value="${user.nickname}"
										class="form-control"> <br />
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">邮件</label>
								<div class="col-sm-4">
									<input id="email" name="email" type="text" value="${user.email}"
										class="form-control"> <br />
								</div>
							</div>
							<div class="hr-line-dashed"></div>						
							<div class="form-group">
								<label class="col-sm-2 control-label">角色</label>
								<div class="col-sm-4">
									<input id="role" name="role" type="text" value="${user.role}"
										class="form-control"> <br />
								</div>
							</div>
							<div class="hr-line-dashed"></div>	
							<div class="form-group">
								<label class="col-sm-2 control-label">学号</label>
								<div class="col-sm-4">
									<input id="studentno" name="studentno" type="text" value="${user.studentno}"
										class="form-control"> <br />
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<div class="col-sm-4 col-sm-offset-2">
									<button class="btn btn-primary" type="submit">保存</button>
									<button class="btn btn-white" type="reset">重置</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">
	function checkimg(obj) {
		//获取到上传的文件的路径
		var filename = obj.value;
		//只能上传.jpg,.png,.gif
		var index = filename.lastIndexOf(".");
		var name = filename.substring( filename.lastIndexOf("."));

		if(name != ".jpg" && name != ".png" && name != ".gif"){
			alert("只能上传.jpg,.png,.gif的文件");
			obj.value = "";
		}
	}
	
	$(function() {
		$("#category").val("${product.category}");
	})
	
	
</script>


</html>