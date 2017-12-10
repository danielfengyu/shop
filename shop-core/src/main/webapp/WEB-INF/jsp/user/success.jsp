<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>
	Welcome
	<font color="red">${user.userName} </font>!
	<br>
	<br>
	<a href="${pageContext.servletContext.contextPath}/customer/list.html">用户信息列表</a>
</body>
</html>