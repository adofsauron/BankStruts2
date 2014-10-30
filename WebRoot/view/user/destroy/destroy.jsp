<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
	<head>
		<title>确认销毁账户</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:60%;
			height:45px;
			font:26px 黑体;
			color:red;
			padding-left:90px;
			padding-top:20px;}
			
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
			font-size:26px;
			padding-left:50px;
			padding-top:30px;}
			
			a:hover{
			color:red;}
		</style>
	</head>
	
	<body>
		<div id="layout01">
		注销账户后，一切数据将全部予以销毁，且无法恢复，请慎重！
		</div>
		
		<div id="layout02">
		</div>
		
		

		<div id="layout03">
		<a href="destroy.action">确认注销账户</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="../../option.jsp">返回操作中心</a>
		</div>
	</body>
</html>