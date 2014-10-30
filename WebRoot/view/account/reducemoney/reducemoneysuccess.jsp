<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
	<head>
		<title>取款成功</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:40%;
			height:50px;
			font:26px 微乳雅黑;
			padding-left:280px;
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
			width:320px;
			height:60px;
			padding-left:60px;
			font:26px 微软雅黑;
			padding-top:20px;}
			
		
			
			#layout04{
			border:1px solid blue;
			width:180px;
			height:45px;
			margin-left:1000px;
			margin-top:5px;
			font:24px 微软雅黑;
			padding-left:25px;
			padding-top:6px;}
			
			a:hover{
			color:red;}
			
		</style>
	</head>
	
	<body>
		<div id="layout01">
		使用银行系统取款成功
		</div>
		
		<div id="layout02">
		</div>
		
		<div id="layout03">
			已成功取出<font color="red"><%=request.getParameter("money")%></font>元
		</div>
		
		<div id="layout04">
		<a href="../../option.jsp">返回操作中心</a>
		</div>
	</body>
</html>