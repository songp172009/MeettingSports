package com.ms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Member implements Serializable {
	/**
	 * 用户实体类
	 * @author jiachao
	 */
	private static final long serialVersionUID = 3761679241260237121L;
	private String memberId;//会员昵称
	private String password;//会员密码
	private String realName;//会员名字
	private Date birth;//出生日期
	private String phone;//电话
	private String email;//邮箱
	private String address;//地址
	private String sex;//性别
	private String memberUrl;//头像;
	private String introduces;//自我介绍
	private String roleType;//会员类型
	private Date loadDate;//上次登录时间
	private Date regTime;//注册时间
	private String habits;//爱好
	private String a1;
	private String accountId;//账户
	private Integer scores;//积分
	
	private Set<Comment> comment= new HashSet<Comment>();
	private Set<Order> order= new HashSet<Order>(); 
	private Set<Friend> friends=new HashSet<Friend>();
	private Set<Position> position=new HashSet<Position>();
	
	//构造方法
	public Member() {
		super();
	}

	public String getMemberId() {
		return memberId;
	}

	public String getPassword() {
		return password;
	}

	public String getRealName() {
		return realName;
	}

	public Date getBirth() {
		return birth;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getSex() {
		return sex;
	}

	public String getMemberUrl() {
		return memberUrl;
	}

	public String getIntroduces() {
		return introduces;
	}

	public String getRoleType() {
		return roleType;
	}

	public Date getLoadDate() {
		return loadDate;
	}

	public Date getRegTime() {
		return regTime;
	}

	public String getHabits() {
		return habits;
	}

	public String getA1() {
		return a1;
	}

	public String getAccountId() {
		return accountId;
	}

	public Integer getScores() {
		return scores;
	}

	public Set<Comment> getComment() {
		return comment;
	}

	public Set<Order> getOrder() {
		return order;
	}

	public Set<Friend> getFriends() {
		return friends;
	}

	public Set<Position> getPosition() {
		return position;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setMemberUrl(String memberUrl) {
		this.memberUrl = memberUrl;
	}

	public void setIntroduces(String introduces) {
		this.introduces = introduces;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public void setHabits(String habits) {
		this.habits = habits;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public void setScores(Integer scores) {
		this.scores = scores;
	}

	public void setComment(Set<Comment> comment) {
		this.comment = comment;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	public void setFriends(Set<Friend> friends) {
		this.friends = friends;
	}

	public void setPosition(Set<Position> position) {
		this.position = position;
	}

	public Member(String memberId, String password, String realName,
			Date birth, String phone, String email, String address, String sex,
			String memberUrl, String introduces, String roleType,
			Date loadDate, Date regTime, String habits, String a1,
			String accountId, Integer scores, Set<Comment> comment,
			Set<Order> order, Set<Friend> friends, Set<Position> position) {
		super();
		this.memberId = memberId;
		this.password = password;
		this.realName = realName;
		this.birth = birth;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.sex = sex;
		this.memberUrl = memberUrl;
		this.introduces = introduces;
		this.roleType = roleType;
		this.loadDate = loadDate;
		this.regTime = regTime;
		this.habits = habits;
		this.a1 = a1;
		this.accountId = accountId;
		this.scores = scores;
		this.comment = comment;
		this.order = order;
		this.friends = friends;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", password=" + password
				+ ", realName=" + realName + ", birth=" + birth + ", phone="
				+ phone + ", email=" + email + ", address=" + address
				+ ", sex=" + sex + ", memberUrl=" + memberUrl + ", introduces="
				+ introduces + ", roleType=" + roleType + ", loadDate="
				+ loadDate + ", regTime=" + regTime + ", habits=" + habits
				+ ", a1=" + a1 + ", accountId=" + accountId + ", scores="
				+ scores + ", comment=" + comment + ", order=" + order
				+ ", friends=" + friends + ", position=" + position + "]";
	}
	
}