<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>注册</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<style>
body {
	text-align: center;
	background-image: url(images/bg.jpg);
	background-repeat: no-repeat;
}

.div {
	margin: 50px auto ;
	width: 1000px;
	height: 700px;
}
</style>

<!-- DWR调用存储方法，执行提交功能 -->



<!-- DWR调用存储方法，执行提交功能 -->

<script type="text/javascript">
   
</script>
</head>

<body>
	<div class="div">
		<form action="login_registersuccess.action" method="get" >
			<table id="newspaper-b">

				<tr>
					<td
						style="color:#663333;font-weight:bold;font-size:20px;text-align:center;"
						colspan="4">新用户注册</td>
				</tr>
				<tr>
					<td>邮箱:</td>
					<td><input type="text" name="email"  placeholder="请输入正确邮箱"
						style="width:300px;" />
					</td>
					<td>*</td>
					<td style="width:260px;"><span id="errName">可使用英文名字</span></td>
				</tr>
				
				<tr>
					<td>登录密码:</td>
					<td><input type="text" name="password"  placeholder="请输入登陆密码"
						style="width:300px;" />
					</td>
				
					<td>*</td>
					<td><span id="errPwd">请使用数字+字母组合以增强安全性</span></td>
				</tr>
				<tr>
					<td>重新输入密码:</td>
					<td><input type="text" name="repassword"  
						 style="width:300px;" placeholder="再次输入密码" /></td>
					<td>*</td>
					<td><span id="reerrPwd">必填</span></td>
				</tr>
				<tr>
					<td>请输入验证码:</td>
					<td><input type="text" name="yanzhengma"  
						 style="width:300px;" placeholder="请输入验证码" /></td>
					<td>*</td>
					<td><a href="#">刷新</a></td>
				</tr>

				<tr>
					<td colspan=4 class="buttom"><span id="agreereg"><input
							type="checkbox" class="checkbox" id="agreeit" name="agree" />
							我已同意<a href="#" style="color: blue;">注册协议</a></span> </td>
				</tr>

				<tr>
					<td align="center">
						<button  type="submit" class="button blue"
							style="font-size:15px;margin:auto;width:100px;" id="subbtn">提&nbsp;&nbsp;&nbsp;交</button>
					</td>
					<td align="center">
						<button type="button" class="button blue"
							style="font-size:15px;margin:auto;width:100px;" id="chongzhi">重&nbsp;&nbsp;&nbsp;置</button>
					</td>
					<td align="center" colspan="2">
						<button type="button" class="button blue"
							onclick="window.location='./index.jsp';"
							style="font-size:15px;margin:auto;width:100px;" id="back">返&nbsp;&nbsp;&nbsp;回</button>
					</td>
				</tr>

			</table>
		</form>
	</div>

</body>
</html>
