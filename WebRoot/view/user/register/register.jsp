<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
	request.setCharacterEncoding("GBK") ;
%>

<html>
	<head>
		<title>用户注册</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:200px;
			height:50px;
			font:26px 微乳雅黑;
			padding-left:90px;
			padding-top:10px;}
			
			#layout02{
			border:1px solid blue;
			margin:20px auto;
			width:100%;
			height:30px;
			background-color:#D7DEF0}
			
			#layout03{
			border:1px solid blue;
			margin:40px auto;
			width:420px;
			height:auto;}
			
			#tiny{
			font:25px 微软雅黑;
			border:2px solid #E3EEFB;
			margin-top:45px;
			margin-left:20px;
			
			width:90%;
			height:240PX;
			background:#FFFFFF;}
			
			#layout04{
			border:1px solid blue;
			width:180px;
			height:40px;
			margin-left:1000px;
			margin-top:10px;
			font:24px 微软雅黑;
			padding-left:25px;
			padding-top:6px;}
			
			#input{
			margin-left:600px;}
		</style>
<!--   
		<script type="text/javascript">
		function validate(){
			var f = document.getElementById("sign");
			 var reg = new RegExp("^\\w+$");
			var reg03 = new RegExp("[^%&',;=?$\x22]+ ");
			var reg02 = new RegExp("^[\u4e00-\u9fa5],{0,}$");
			
			if(f.user.name.value == "")
				alert("用户名不能为空");
			 /* else if(!reg.test(f.UserName.value))    
				alert("用户名不符合要求，只能为数字、字母或下划线组成!!");  */
			else if(f.user.password.value=="")
				alert("密码不能为空");
			else if(f.user.password.value != f.repassword.value)
				alert("两次密码不一致!!!");
			else
				f.submit();
				
		}
		</script>
-->			
	</head>
	
	<body>
		<div id="layout01">
		欢迎注册
		</div>
		
		<div id="layout02">
		</div>
		
		<div id="input">
		<s:fielderror cssStyle="color: red"></s:fielderror>
		<!-- 校验出的错误信息 -->
		</div>
		
		<div id="layout03">
		<form action="register.action" method="post" id="sign">
		
		<table id="tiny">
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="user.name" maxlength="20"></td>
				</tr>
				
				
				<tr>
					<td>密码：</td>
					<td><input type="password" name="recpassword" maxlength="20"></td>
				</tr>
				
				<tr>
					<td>密码确认：</td>
					<td><input type="password" name="user.password" maxlength="20"></td>
				</tr>
				<tr>
					<td>手机号码：</td>
					<td><input type="text" name="user.tel" maxlength="11"></td>
				</tr>
				<tr>
					<td>电子邮箱：</td>
					<td><input type="text" name="user.email" maxlength="50"></td>
				</tr>
				<tr>
					<td><input type="submit" value="提交" /></td>
					<td><input type="reset" value="重置" /></td>
				</tr>
		</div>
		
		
	</body>
</html>