<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
   <!--c_header start-->
	<div class="c_header">
		<div class="h_nav">
			<ul>
				<li>
					<a href="#" class="h_sel">
						<i class="h_icon_1"></i>
						<span class="h_text">首页</span>
					</a>
				</li>
				<li>
					<a href="#">
						<i class="h_icon_2"></i>
						<span class="h_text">界面管理</span>
					</a>
				</li>
				<li>
					<a href="#">
						<i class="h_icon_3"></i>
						<span class="h_text">栏目管理</span>
					</a>
				</li>
				<li>
					<a href="#">
						<i class="h_icon_4"></i>
						<span class="h_text">内容管理</span>
					</a>
				</li>
				<li>
					<a href="#">
						<i class="h_icon_5"></i>
						<span class="h_text">用户管理</span>
					</a>
				</li>
				<li>
					<a href="#">
						<i class="h_icon_6"></i>
						<span class="h_text">论坛中心</span>
					</a>
				</li>
				<li>
					<a href="#">
						<i class="h_icon_7"></i>
						<span class="h_text">应用中心</span>
					</a>
				</li>
				<li>
					<a href="#">
						<i class="h_icon_8"></i>
						<span class="h_text">工具</span>
					</a>
				</li>
			</ul>
		</div>
		<div class="h_info">
			<div class="i_user">当前用户：${session.User.memberId}, 身份：${session.userRole.roleType}</div>
			<div class="i_out">
				<a href="#">
					<span class="i_exit">退出</span>
					<i class="i_icon"></i>
				</a>
			</div>
		</div>
	</div>
	<!--end c_header-->
