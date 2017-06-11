<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html id="content-doc" class="content-doc">
<head>
<link rel="stylesheet" type="text/css" 
      href="${pageContext.servletContext.contextPath}/css/easyUI/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" 
      href="${pageContext.servletContext.contextPath}/css/easyUI/themes/icon.css">
<link rel=stylesheet type="text/css" 
      href="${pageContext.servletContext.contextPath}/css/base.css">
<script type="text/javascript" 
        src="${pageContext.servletContext.contextPath}/js/plugins/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" 
        src="${pageContext.servletContext.contextPath}/js/plugins/easyUI/jquery.easyui.min.js"></script>
<script type="text/javascript" 
        src="${pageContext.servletContext.contextPath}/js/customer/customer.list.js"></script>
<title>顾客信息列表</title>
</head>
<body id="content-body" class="content-body">
	<div style="width:100%;height:10%;"></div>
	<table class="easyui-datagrid" title="顾客列表" style="width:99%;height:90%;"
			data-options="singleSelect:true,collapsible:true,url:'${pageContext.servletContext.contextPath}/customer/customer-data',method:'post'">
		<thead>
			<tr>
				<th data-options="field:'customerId',width:getWidth(0.3),align:'center'">客户ID</th>
				<th data-options="field:'customerName',width:getWidth(0.3),align:'center'">客户名字</th>
				<th data-options="field:'customerAddress',width:getWidth(0.388),align:'center'">客户地址</th>
			</tr>
		</thead>
	</table>
</body>
</html>