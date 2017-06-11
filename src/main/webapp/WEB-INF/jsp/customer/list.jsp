<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>customer list</title>
<link rel=stylesheet type="text/css" href="${pageContext.servletContext.contextPath}/css/base.css">
<link rel=stylesheet type="text/css" href="${pageContext.servletContext.contextPath}/css/font-awesome-4.5.0/css/font-awesome.min.css">
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/plugins/jquery/jquery-1.11.3.min.js"></script>
</head>
<body>
	<div id="top" class="top"></div>
	<div id="body"class="body">
	    <div id="left"class="left-title">
	    	<ul id="list">
	    		<li>用户列表</li>
	    		<li>商品列表</li>
	    		<li>订单列表</li>
	    		<li>顾客列表</li>
	    	</ul>
	    </div>
	    <div id="edge"class="edge"></div>
	    <div id="right"class="right-content">
	    	<iframe id="list-page" class="list-page" src="${pageContext.servletContext.contextPath}/customer/customer-list.html"></iframe>
	    </div>
	    <!-- 右边的悬浮类容 suspend -->
	  <!--   <div id="suspend"class="suspend-content"><span style="margin:0 auto"><i class="fa  fa-chevron-left"></i></span></div> -->
	</div>
</body>
</html>