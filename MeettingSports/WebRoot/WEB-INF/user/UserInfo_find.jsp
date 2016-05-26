<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查看个人信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <style type="text/css">
  	body{background:url("./images/lv.jpg")
			no-repeat 
			;}
  </style>
  <body>
  			<div class="head">
  				<h2></h2>
  			</div>
    	  <div>
  <table border="1px"   bordercolor="gray" cellpadding="50" cellspacing="0px" align=center>
	<tr>
	<td>昵称</td>
	<td colspan="2">${session.User.nick }</td>
	 <td>姓名</td>
	<td colspan="2">${session.User.userId }</td>
	
	<td rowspan="2">照片</td>
	</tr>
	<tr>
	<td>性别</td>
	<td colspan="2">${session.User.sex }</td>
	<td>年龄</td>
	<td colspan="2">${session.User.birth }</td>
	
	<tr>
	<td>地址</td>
	<td colspan="7">${session.User.address }</td>
	</tr>
	
	<tr>
	<td>技能</td>
	<td colspan="7">${session.User.skill}</td>
	</tr>
	<tr>
	<td>喜欢的运动</td>
	<td colspan="7">${session.User.sports }</td>
	</tr>
	<tr>
	<td>联系电话</td>
	<td colspan="7">${session.User.phone }</td>
	</tr>
	<tr>
	<td>兴趣爱好</td>
	<td colspan="7">&nbsp;</td>
	</tr>
	<tr>
	<td>自我评价</td>
	<td colspan="7">${session.User.introduces }</td>
	</tr>
  </table>
</div>    
  </body>
</html>
