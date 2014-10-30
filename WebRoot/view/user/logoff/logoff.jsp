<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
	<head>
		<title>确认退出系统</title>
		
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
			height:50px;
			font-size:26px;
			padding-left:50px;
			padding-top:20px;}
			
			a:hover{
			color:red;}
		</style>
	</head>
	
	<body>
		<div id="layout01">
		是否确定退出银行管理系统
		</div>
		
		<div id="layout02">
		</div>
		
		

		<div id="layout03">
		<a href="logoff.action">确认退出系统</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="../../option.jsp">返回操作中心</a>
		</div>
	</body>
</html>