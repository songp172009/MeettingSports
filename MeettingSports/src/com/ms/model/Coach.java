package com.ms.model;

import java.io.Serializable;

public class Coach implements Serializable {

	/**
	 * 教练实体类
	 * @author jiachao
	 */
	private static final long serialVersionUID = 1L;

	

	private String coachId;
	private String memberId;
	private String orderId;
	private Order order;
	private String status;
	private String a;
	private String b;
	
	
	public Coach() {
		super();
	}
	public Coach(String coachId, String memberId, String orderId, Order order,
			String status, String a, String b) {
		super();
		this.coachId = coachId;
		this.memberId = memberId;
		this.orderId = orderId;
		this.order = order;
		this.status = status;
		this.a = a;
		this.b = b;
	}
	public String getCoachId() {
		return coachId;
	}
	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Coach [coachId=" + coachId + ", memberId=" + memberId
				+ ", orderId=" + orderId + ", order=" + order + ", status="
				+ status + ", a=" + a + ", b=" + b + "]";
	}
	
	
	
}
