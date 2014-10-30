<%@ page language="java" import="java.util.*, java.sql.Timestamp ,bean.*" pageEncoding="UTF-8"%>

<%
	User user = (User) request.getAttribute("userQ");
	ArrayList<Record> records = (ArrayList<Record>) request.getAttribute("records");
%>


<html>
	<head>
		<title>个人信息</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:35%;
			height:40px;
			font:26px 微乳雅黑;
			padding-left:340px;
			padding-top:10px;}
			
			#layout02{
			border:1px solid blue;
			margin:20px auto;
			width:100%;
			height:30px;
			background-color:#D7DEF0}
			
			#layout03{
			border:1px solid blue;
			margin:50px auto;
			width:320px;
			height:auto;
			padding-left:60px;}
			
			ul{
			list-style-type: square;}
		
			li{
			font:18px 黑体;
			margin-top:10px;}
			
			#layRecord{
			margin:50px auto;
			width:400px;
			padding-left:50px;}
			
			
			#layout04{
			border:1px solid blue;
			width:180px;
			height:40px;
			margin-left:1000px;
			margin-top:10px;
			font:24px 微软雅黑;
			padding-left:25px;
			padding-top:6px;}
			
			#limi{
			font:微软雅黑;}
			
			a:hover{
			color:red;}
			
		</style>
	</head>
	
	<body>
		<div id="layout01">
		用户信息查询
		<struts:property value="money" />
		</div>
		
		<div id="layout02">
		</div>
		
		<div id="layout03">
			<ul id="square">
				<li>用户名：<font color="red"><%=user.getName()%></font></li>
				<li>密码：<font color="red"><%=user.getPassword()%></font></li>
				<li>账户余额：<font color="red"><%=request.getAttribute("money")%></font> 元</li>
				<li>电话号码：<font color="red"><%=user.getTel()%></font></li>
				<li>电子邮箱：<font color="red"><%=user.getEmail()%></font></li>
			</ul>
		</div>
		
		<div id="layRecord">
		<table border="1">
		<tr>
			<div id="limi">
			<td>记录类型</td>
			<td>变更钱数</td>
			<td>记录日期 </td>
			</div>
		</tr>	

<%
	for(int n=0; n<records.size(); n++)
	{
		Record record = records.get(n);
%>
		<tr>
			<td><font color="blue"><%=record.getKind()%></font></td>
			<td><font color="red"><%=record.getValue()%></font></td>
			
			<td><font color="#0000FF"><%=record.getTime()%></font></td>
		</tr>
<%
	}
%>
		</table>
		</div>
		
		<div id="layout04">
		<a href="option.jsp">返回操作中心</a>
		</div>
	</body>
</html>