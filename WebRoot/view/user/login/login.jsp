<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
	request.setCharacterEncoding("GBK") ;
%>

<html>
	<head>
		<title>用户登陆</title>
		
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
			height:200PX;
			background:#FFFFFF;}
			
			#input{
			margin-left:600px;}
			
			
		</style>
<!--  	
		<script type="text/javascript">
		function validate(){
			var f = document.getElementById("sign");
			
			   var reg = new RegExp("^\\w+$");
			
			if(f.UserName.value == "")
				alert("用户名不能为空！！！");
			/* else if(!reg.test(f.UserName.value))
				alert("用户名不符合要求，只能为数字、字母、下划线组成!!"); */
			else if(f.UserPassword.value=="")
				alert("密码不能为空!!!");
			
				
		}
		</script>
-->			
	</head>
	
	<body>
		<div id="layout01">
		欢迎登陆
		</div>
		
		<div id="layout02">
		</div>
		
		<div id="input">
		<s:fielderror cssStyle="color: red"></s:fielderror>
		<!-- 校验出的错误信息 -->
		</div>
		
		<div id="layout03">
		<form action="login.action" method="post" id="sign">
			<table id="tiny">
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="user.name" maxlength="20"></td>
				</tr>
				
				<tr>
					<td>密码：</td>
					<td><input type="password" name="user.password" maxlength="20"></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="提交" onclick="validate()"/></td>
					<td><input type="reset" value="重置" /></td>
				</tr>
			</table>
		</form>
		
		</div>
	</body>
</html>