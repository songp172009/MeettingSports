<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

 <!--c_left start-->
	
	<div class="c_left">
		<div class="c_logo"></div>
		<div class="c_nav">
			<ul>
				<li>
					<a href="UserInfo_find.action">
						<i class="c_icon_1"></i>
						<span class="c_text">查看个人信息</span>
					</a>
				</li>
				<li>
					<a href="UserInfo_update.action">
						<i class="c_icon_2"></i>
						<span class="c_text">修改个人信息</span>
					</a>
				</li>
				<s:if test="'coach'==#session.userRole.roleType ">
				<li>
						<a href="CoachUser_comment.action">
							<i class="c_icon_3"></i>
							<span class="c_text">用户评价</span>
						</a>
					</li>
					<li>
						<a href="CoachOrders_Omanage.action">
							<i class="c_icon_4"></i>
							<span class="c_text">订单管理</span>
						</a>
					</li>
					<li>
						<a href="CoachInfo_account.action">
							<i class="c_icon_5"></i>
							<span class="c_text">我的资产</span>
						</a>
					</li>
					<li>
						<a href="CourseInfo_Cmanage.action">
							<i class="c_icon_6"></i>
							<span class="c_text">课程管理</span>
						</a>
					</li>
					<li>
						<a href="CoachUser_comment.action">
							<i class ="c_icon_7"></i>
							<span class ="c_text">交流管理</span>
						</a>
					</li>
					</s:if>
					
					<s:if test="'seller'==#session.userRole.roleType ">
					<li>
					<img src="../../images/radio_green.gif"/>
						<a href="SellerUser_comment.action">
							<i class ="c_icon_3"></i>
							<span class ="c_text">用户评价 </span>
						</a> 
					</li>
					<li>
						<a href="SellerVenue_account.action">
							<i class ="c_icon_4"></i>
							<span class ="c_text">厂馆租金 </span>
						</a> 
					</li>
					<li>
						<a href="SellerVenue_use.action">
							<i class ="c_icon_5"></i>
							<span class ="c_text">厂馆使用 </span>
						</a> 
					</li>
					<li>
						<a href="SellerVenue_level.action">
							<i class ="c_icon_6"></i>
							<span class ="c_text">星级 </span>
						</a> 
					</li>					
					<li>
						<a href="SellerUser_common.action">
							<i class ="c_icon_7"></i>
							<span class ="c_text">同类厂家</span>
						</a> 
					</li>
					 </s:if>
					<s:if test="'admin'==#session.userRole.roleType">
					<li  >
					
						<a href="UserInfo_manage.action">
							<i class="c_icon_3"></i>
							<span class ="c_text">用户管理</span>
						</a>
						<ul >
							<li>
								<a href="UserInfo_add.action">
									<i class="b"></i>
									<span class ="Add">增加用户</span>
								</a>
							</li>
							<li>
								<a href ="UserInfo_remove.action">
								<i class="b"></i>
									<span class ="Remove">	删除用户</span>
								</a>
							</li>
							<li>
								<a href ="UserInfo_update.action">
								<i class="b"></i>
									<span class ="update">修改用户信息</span>
								</a>
							</li>
							<li>
								<a href="UserInfo_search.action">
								<i class="b"></i>
									<span class ="query">查看用户信息</span>
								</a>
							</li>
						</ul>
					</li>
					<li>
						<a href="Form.action">
							<i class="c_icon_4"></i>
							<span class ="c_text">版块管理 </span> 
						</a>
					</li>
					<li>
						<a href="AD.action">
							<i class="c_icon_5"></i>
							<span class ="c_text">广告管理 </span> 
						</a>
					</li>
					<li>
						<a href="Message.action">
							<i class="c_icon_6"></i>
							<span class ="c_text">消息推送 </span> 
						</a>
					</li>
					<li>
						<a href="Map.action">
							<i class="c_icon_7"></i>
							<span class ="c_text">地图查询 </span> 
						</a>
					</li>
					</s:if>
			</ul>
		</div>
	</div>
	<!--end c_left-->
