<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/common.jsp" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商店管理系统</title>
<link rel=stylesheet type="text/css" href="${pageContext.servletContext.contextPath}/css/login.css">
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/plugins/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		//alert("hello world!");
	});
</script>
</head>
<body>
<div id="header">
</div>
<div id="login">
	<form id="loginForm" action="${pageContext.servletContext.contextPath}/user/login.html" method="post">
		<table>
			<tr>
			  <td align="center">
			          用户名:<input id="userName" type="text" name="username">
			  </td>
			</tr>
			<tr>
			  <td align="center"> 
			          密码&nbsp;：<input id="password" type="password" name="password">
			  </td>
			</tr>
			<tr>
			  <td align="center">
			    <input size="" type="submit" name="Submit" value="登陆">
			    <input size="" type="reset" style="margin-right:0px" value="重置">
			  </td>
			</tr>
		</table>
	</form>
</div>
<div id="tail">
</div>
</body>
</html>