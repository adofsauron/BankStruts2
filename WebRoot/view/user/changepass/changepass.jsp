<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>修改密码</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:40%;
			height:50px;
			font:26px 微乳雅黑;
			padding-left:260px;
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
			height:auto;
			padding-top:10px;
			padding-left:27px;}
			
			
			#input{
			margin-left:600px;}

			#layout04{
			border:1px solid blue;
			width:180px;
			height:45px;
			margin-left:1000px;
			margin-top:10px;
			font:24px 微软雅黑;
			padding-left:25px;
			padding-top:6px;}
			
			td{
			font:24px 微软雅黑;
			margin-left:10px;}
			
		</style>
		<!--  
		<script type="text/javascript">
		function validate(){
			var f = document.getElementById("sign");
			
			if(f.UserPassword.value==""|| f.reUserPassword.value=="")
				alert("密码不能为空！！！");
			else if(f.reUserPassword.value != f.reUserPassword02.value )
				alert("新密码两次输入不一致！！");
			else
				f.submit();
		}
		</script>
		-->
	</head>
	
	<body>
		<div id="layout01">
		请按提示进行密码修改操作
		</div>
		
		
		<div id="layout02">
		</div>
		
		<div id="input">			
		<s:fielderror></s:fielderror>
				<!-- 校验出的错误信息 -->	
		</div>	
						
			<form action="changepass.action" method="post" id="sign">
			<table id="layout03">
			
				<tr>
					<td>输入旧密码：</td>
					<td><input type="password" name="UserPassword" maxlength="20"></td>
				</tr>
				
				<tr>
					<td>输入新密码：</td>
					<td><input type="password" name="recpassword" maxlength="20"></td>
				</tr>
				<tr>
					<td>确认新密码：</td>
					<td><input type="password" name="redpassword" maxlength="20"></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="提交" onclick="validate()"/></td>
					<td><input type="reset" value="重置" /></td>
				</tr>
				
				</table>
		</form>
		
		
		<div id="layout04">
		<a href="../../option.jsp">返回操作中心</a>
		</div>
		

	</body>
</html>