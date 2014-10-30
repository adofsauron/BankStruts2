<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>存款操作</title>
		
		<style type="text/css">
			#layout01{
			border:1px solid  blue;
			margin:20px auto;
			width:40%;
			height:50px;
			font:26px 微乳雅黑;
			padding-left:260px;
			padding-top:10px;}
			
			#layout02{
			border:1px solid blue;
			margin:20px auto;
			width:100%;
			height:30px;
			background-color:#D7DEF0}
			
			#layout03{
			border:1px solid blue;
			margin:80px auto;
			width:420px;
			height:120px;
			padding-top:10px;
			padding-left:10px;}

			#layout04{
			border:1px solid blue;
			width:180px;
			height:45px;
			margin-left:1000px;
			margin-top:10px;
			font:24px 微软雅黑;
			padding-left:25px;
			padding-top:6px;}
			
			td{
			font:24px 微软雅黑;
			margin-left:10px;}
			
			#input{
			margin-left:600px;}
			
		</style>
<!-- 	
		<script type="text/javascript">
		
		function validate(){
       var reg = new RegExp("^[0-9]+(.[0-9]{1,10})?$");
       var obj = document.getElementById("sign");
	   
	   if(obj.money.value=="")
				alert("钱数不能为空");
		else if(!reg.test(obj.money.value)){
			alert("只能输入数字!");
			}
		else if(!/^[0-9]+(.[0-9]{1,10})?$/.test(obj.money.value)){
			alert("只能输入数字!");
			}
		else
			obj.submit();
		}
		</script>
 -->	
 <!--  
 <script type="text/javascript">
    function get(){
    var value=document.getElementById("name_name").value;
         alert(value); 
    }	
 </script>	
 -->
	</head>
	
	<body>
		<div id="layout01">
		请按提示进行存款操作
		</div>
		
		<div id="layout02">
		</div>
		
		<div id="input">			
		<s:fielderror cssStyle="color: red"></s:fielderror>
				<!-- 校验出的错误信息 -->	
		</div>
		
		<form action="addMoney.action" method="post" id="sign">
			<table id="layout03">
				<tr>
					<td>请输入要存的钱数：</td>
					<td><input id ="name_name"type="text" name="money" ></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="提交"  onclick="get();"/></td>
					<td><input type="reset" value="重置" /></td>
				</tr>
			</table>
		</form>
		
		<div id="layout04">
		<a href="../../option.jsp">返回操作中心</a>
		</div>
		
	
	</body>
</html>
<s:debug></s:debug>