package com.ms.model;

import java.io.Serializable;

public class MemberOrder implements Serializable{

	/**
	 * @author jiachao
	 */
	private static final long serialVersionUID = 1L;
	
	private String memberOrderId;
	private String orderId;
	private String memberType;
	private String a1;
	public MemberOrder() {
		super();
	}
	public MemberOrder(String memberOrderId, String orderId, String memberType,
			String a1) {
		super();
		this.memberOrderId = memberOrderId;
		this.orderId = orderId;
		this.memberType = memberType;
		this.a1 = a1;
	}
	public String getMemberOrderId() {
		return memberOrderId;
	}
	public void setMemberOrderId(String memberOrderId) {
		this.memberOrderId = memberOrderId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	@Override
	public String toString() {
		return "MemberOrder [memberOrderId=" + memberOrderId + ", orderId="
				+ orderId + ", memberType=" + memberType + ", a1=" + a1 + "]";
	}

}
