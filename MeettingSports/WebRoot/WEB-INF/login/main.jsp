<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>约运动后台服务系统</title>
  
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="./css/main.css"> 

	<script type="text/javascript" src="../../js/jquery/jquery.js"></script>
  </head>
  
  <body>
	<s:debug></s:debug>  
   <jsp:include page="/WEB-INF/component/left.jsp" ></jsp:include>
    <jsp:include page="/WEB-INF/component/header.jsp" ></jsp:include>
   
    <jsp:include page="/WEB-INF/component/right.jsp" ></jsp:include>
  </body>
</html>
