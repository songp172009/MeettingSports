package com.ms.model;

import java.io.Serializable;

public class Role implements Serializable {
	/**
	 * 角色实体信息
	 * @author jiachao
	 */
	private static final long serialVersionUID = 3155795380658456864L;
	private Integer roleId;
	private String roleType;
	private String roleDesc;
	private String a1;
	private MemberRole userRole;
	
	//构造方法
	public Role() {
		super();
	}
	public Role(Integer roleId, String roleType, String roleDesc, String a1,
			MemberRole userRole) {
		super();
		this.roleId = roleId;
		this.roleType = roleType;
		this.roleDesc = roleDesc;
		this.a1 = a1;
		this.userRole = userRole;
	}
	
	//getter和setter方法
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	public MemberRole getUserRole() {
		return userRole;
	}
	public void setUserRole(MemberRole userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleType=" + roleType
				+ ", roleDesc=" + roleDesc + ", a1=" + a1 + ", userRole="
				+ userRole + "]";
	}
}
