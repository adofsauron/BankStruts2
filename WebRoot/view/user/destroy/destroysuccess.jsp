<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	session.removeAttribute("userId");
	//销毁该账户唯一标识id
%>

<html>
	<head>
		<title>注销成功</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:40%;
			height:50px;
			font:26px 微乳雅黑;
			padding-left:240px;
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
			width:450px;
			height:60px;
			font-size:24px;
			padding-left:50px;
			padding-top:24px;}
			
			a:hover{
			color:red;}
		</style>
	</head>
	
	<body>
		<div id="layout01">
		已退出该账户，感谢使用
		</div>
		
		<div id="layout02">
		</div>
		
		

		<div id="layout03">
		已注销该账户，点击<a href="../../../">银行系统</a>重新进入
		</div>
	</body>
</html>