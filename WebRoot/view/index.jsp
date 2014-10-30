<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<title>欢迎进入银行管理系统</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:40%;
			height:50px;
			font:26px 微乳雅黑;
			padding-left:290px;
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
			width:420px;
			height:80px;}
			
			ul{
			list-style: none;
			
			font-size:26px;
			background:#EDEDED;}
			
			li {
			float:left;	
			width:90px;
			margin-left:60px;
			margin-top:0px;}
			
			a:hover{
			color:red;}
		</style>
	</head>
	
	<body>
		<div id="layout01">
		欢迎使用银行管理系统
		</div>
		
		<div id="layout02">
		</div>
		
		<div id="layout03">
		<ul>
			<li><a href="view/user/login/login.jsp">登陆</a></li>
			<li><a href="view/user/register/register.jsp">注册</a></li>
		</ul>
		</div>
	</body>
</html>