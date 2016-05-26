<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
		
		<title>约运动后台服务系统</title> 
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
		<link rel="stylesheet" type="text/css" href="./css/login.css" /> 
		<!--引入jQuery的官方类库-->
		<script type="text/javascript" src="js/jquery/jquery.js"></script>
		<script type="text/javascript">
		/*
		$(document).ready(function(){
			if($("#fileError").css('display','block')){
				$("#tips").css('display','none');
			}
		});
		*/
		function reloadCode(){
			var time = new Date().getTime();
			document.getElementById("safecode").src="<%=request.getContextPath() %>/VerifyCodeServlet?d="+time;
			
		};
		
		function login(){
			var username = $("#username").val();
			var password = $("#password").val();
			if(username.length == 0 || !/^[\da-zA-Z_\u4e00-\u9fa5]{2,16}$/.test(username) ){
				//alert("请您输入正确的用户名 ！");
				yanzheng($("#username"));
				return false;
			}
			if(password.length == 0 || !/^[\@A-Za-z0-9\!\#\$\%\^\&\*\.\~]{6,15}$/.test(password)){
				//alert("您的密码输入错误 ！");
				yanzheng($("#password"));
				return false;
			}
			$("#form").submit();
			return true;	
		}
		function yanzheng($this){
			var tip = $this.attr("tip");
			//alert(tip);
			$("#tips").text(tip).css("color","rgb(26,140,255)");
		};
		
			
		
		
	</script>
	</head>
  
  <body>
    <div class="container">
        <div class="wrapper">
            <div class="heading">
                <div class="heading_nav">
                    <div class="heading_title">
				约运动后台服务系统
                    </div>

                    <div class="heading_navbar">
                        <ul>
                            <li><a href="#">首页</a></li>
                            
                            <li><a href="#">技术问答</a></li>
                            
                        </ul>
                    </div>

                    <div class="heading_img">
                        <img src="<%=basePath%>images/logo.jpg" />
                    </div>

                    <div class="heading_sopt">
                        <form>
                            <input type="text" />
                        </form>
                    </div>
				</div>
             </div>
           <s:debug></s:debug>
            <div class="body">
                <div class="login">
					<form id="form" action="login_check.action" method="get"  >
					<div class="top">
						<span id="tips">管理登陆</span>
						<s:fielderror id="fileError" style="font-size:20px;font-color:antiquewhite"></s:fielderror>		
					</div>

					<div class="text">
						<input type="text" name="memberId" id="username" tip="请输入正确的昵称或手机号" placeholder="请输入用户名" />
						
						<input type="password" name="password" id="password" tip="请输入密码,由数字字母下划线构成(6-15)" placeholder="请输入密码" />
						<div></div>
						<!-- <s:fielderror class="error" name="password"></s:fielderror>	-->
					</div>
					
					<!-- 验证码部分 -->
					<div class="logintd">
						<input class="mytxt" type="text" id="validate_code" name="validate_code"   placeholder="请输入验证码" />
  						<img  alt="看不清？点击图片刷新" id="safecode" src="<%=request.getContextPath() %>/VerifyCodeServlet" onclick="reloadCode()" />
  						
					</div>
					
					<div class="btn">
						
						<!-- <input id="register" type="submit" value="" /> -->
						
						<button id="btn1" type="button" onclick="login()">登&nbsp;&nbsp;&nbsp;录</button> 
						<button id="register" type="button" ><a href="login_register.action">注&nbsp;&nbsp;&nbsp;册</a></button>
					</div>

					<div class="remember">
						<span><a href="login_remember.action">忘记登录密码？</a></span>
					</div>
				</form>
		
                
        </div>
      </div>
        
        <!-- footer -->
        <div class="footing">
            @约运动V1.0
        </div>
    </div>
	</div>
  </body>
</html>
