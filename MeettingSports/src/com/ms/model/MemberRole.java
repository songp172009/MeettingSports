package com.ms.model;

import java.util.HashSet;
import java.util.Set;

public class MemberRole {
	
	/**
	 * 登录用户
	 * @author jiachao
	 */
	private String id;
	private String loginame;
	private String password;
	private Member user;
	private Set<Role> role=new HashSet<Role>();
	
	
	public MemberRole() {
		super();
	}
	
	public String getid() {
		return id;
	}
	public void setUserId(String id) {
		this.id = id;
	}
	public String getLoginame() {
		return loginame;
	}
	public void setLoginame(String loginame) {
		this.loginame = loginame;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Member getUser() {
		return user;
	}
	public void setUser(Member user) {
		this.user = user;
	}
	public Set<Role> getRole() {
		return role;
	}
	public void setRole(Set<Role> role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", loginame=" + loginame
				+ ", password=" + password + ", user=" + user + ", role="
				+ role + "]";
	}
	public MemberRole(String id, String loginame, String password, Member user,
			Set<Role> role) {
		super();
		this.id = id;
		this.loginame = loginame;
		this.password = password;
		this.user = user;
		this.role = role;
	}
	
	
	
}
