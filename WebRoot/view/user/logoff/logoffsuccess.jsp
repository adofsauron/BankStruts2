<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	session.removeAttribute("userId");
	
%>

<html>
	<head>
		<title>退出系统</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:40%;
			height:50px;
			font:26px 微乳雅黑;
			padding-left:210px;
			padding-top:10px;}
			
			#layout02{
			border:1px solid blue;
			margin:20px auto;
			width:100%;
			height:30px;
			background-color:#D7DEF0}
			
			#layout03{
			border:1px solid blue;
			margin:90px auto;
			width:440px;
			height:50px;
			font-size:26px;
			padding-left:80px;
			padding-top:20px;}
			
			a:hover{
			color:red;}
		</style>
	</head>
	
	<body>
		<div id="layout01">
		已退出银行管理系统，感谢使用
		</div>
		
		<div id="layout02">
		</div>
		
		

		<div id="layout03">
		已退出，点击<a href="../../../">银行系统</a>重新进入
		</div>
	</body>
</html>