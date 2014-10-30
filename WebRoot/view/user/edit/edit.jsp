<%@ page language="java" import="java.util.*,bean.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<%
	User user = (User)  session.getAttribute("userQ");
	String name = user.getName();
	String tel = user.getTel();
	String password = user.getPassword();
	int id = user.getId();
	String email = user.getEmail();
%>

<html>
	<head>
		<title>修改用户信息</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:200px;
			height:50px;
			font:26px 微乳雅黑;
			padding-left:40px;
			padding-top:10px;}
			
			#layout02{
			border:1px solid blue;
			margin:20px auto;
			width:100%;
			height:30px;
			background-color:#D7DEF0}
			
			#layout03{
			border:1px solid blue;
			margin:70px auto;
			width:420px;
			height:320px;}
			
			#tiny{
			font:25px 微软雅黑;
			border:2px solid #E3EEFB;
			margin-top:45px;
			margin-left:20px;
			
			width:90%;
			height:240PX;
			background:#FFFFFF;}
			
			#input{
			margin-left:600px;}
		</style>
	
	</head>
	
	<body>
		<div id="layout01">
		修改用户信息
		</div>
		
		<div id="layout02">
		</div>
		
		<div id="input">
		<s:fielderror></s:fielderror>
		<!-- 校验出的错误信息 -->
		</div>
		
		<div id="layout03">
		<form action="update.action" method="post" id="sign">
		
		<table id="tiny">
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="user.name" maxlength="20" value=<%=name%>></td>
				</tr>
				<input type="hidden" name="user.password" value=<%=password%>>
			<!-- 	<input type="hidden" name="user.password" value=<%=id%>>
				在修改信息功能中，不能修改密码，只能修改其他信息，修改密码要另外设置，但以对象返回必须要将所有的属性都赋值，故将该字段隐藏，id字段同样隐藏处理-->
				<tr>
					<td>电话号码：</td>
					<td><input type="text" name="user.tel" maxlength="11" value=<%=tel%>></td>
				</tr>
				<tr>
					<td>电子邮箱：</td>
					<td><input type="text" name="user.email" maxlength="50"  value=<%=email%>></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="保存" /></td>
					<td></td>
				</tr>
		</div>
	</body>
</html>