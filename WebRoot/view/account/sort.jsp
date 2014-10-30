<%@ page language="java" import="java.util.*,bean.*, vo.Account_user" pageEncoding="UTF-8"%>

<html>
	<head>
		<title>财富排行</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:20%;
			height:50px;
			font:26px 微乳雅黑;
			padding-left:170px;
			padding-top:10px;}
			
			#layout02{
			border:1px solid blue;
			margin:20px auto;
			width:100%;
			height:30px;
			background-color:#D7DEF0}
			
			#layout03{
			margin:30px auto;
			width:320px;
			height:200px;
			padding-left:10px;}
			
			#layout06{
			margin-top:80px;
			margin-left:900px;
			width:180px;
			height:30px;
			border:1px solid blue;
			padding-left:20px;
			padding-top:7px;
			font:20px 黑体;}
			
			#layout04{
			border:1px solid blue;
			width:180px;
			height:45px;
			margin-left:1000px;
			margin-top:40px;
			font:24px 微软雅黑;
			padding-left:25px;
			padding-top:6px;}
			
			a:hover{
			color:red;}
			
			td{
			width:80px;}
			
		</style>
	</head>
	
	<body>
		<div id="layout01">
		财富排行
		</div>
		
		<div id="layout02">
		</div>
		
		<div id="layout03">
		<table border="1" id="layout05">
		<tr>
			<td>名次</td>
			<td>姓名</td>
			<td>钱数总额</td>
			<td>电话号码</td>
		</tr>
<%
	ArrayList<Account_user> account_users = (ArrayList<Account_user>) request.getAttribute("account_users");
	for(int n=0; n<account_users.size(); n++)
	{
		Account_user account_user = account_users.get(n);
%>
		<tr>
		<td><font color="red">[<%=n+1%>]</font></td>
			<td><font color="blue"><%=account_user.getName()%></font></td>
			<td><font color="red"><%=account_user.getMoney()%></font></td>
			
			<td><font color="#0000FF"><%=account_user.getTel()%></font></td>
		</tr>
<%
	}
%>

	</table>
		</div>
		
		<div id="layout06">
		当前账户排名为[<font color="red"><%=request.getAttribute("count")%></font>]
		</div>



		<div id="layout04">
		<a href="option.jsp">返回操作中心</a>
		</div>
	</body>
</html>