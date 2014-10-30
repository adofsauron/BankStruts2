<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<title>欢迎进入操作中心</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:40%;
			height:50px;
			font:26px 微乳雅黑;
			padding-left:300px;
			padding-top:10px;}
			
			#layout02{
			border:1px solid blue;
			margin:20px auto;
			width:100%;
			height:30px;
			background-color:#D7DEF0}
			
			#layout03{
			border:1px solid blue;
			margin:30px auto;
			width:300px;
			height:525px;
			padding-left:50px;}
			
			ul{
			list-style-type: square;}

			li{
			margin-top:30px;
			font:25px 微软雅黑;}
			
			a:hover{
			color:red;}
		</style>
	</head>
	
	<body>
		<div id="layout01">
		银行系统操作中心
		</div>
		
		<div id="layout02">
		</div>
		
		<div id="layout03">
		<ul class="square">
			<li><a href="query.action">查询个人信息</a>
			<li><a href="edit.action">修改个人信息</a>
			<li><a href="account/addmoney/addmoney.jsp">存款</a>
			<li><a href="account/reducemoney/reducemoney.jsp">取款</a>
			<li><a href="user/changepass/changepass.jsp">修改密码</a>
			<li><a href="sort">财富排行</a>
			<li><a href="user/destroy/destroy.jsp">注销账户</a>
			<li><a href="user/logoff/logoff.jsp">退出系统</a>
		</ul>
		</div>
	</body>
</html>