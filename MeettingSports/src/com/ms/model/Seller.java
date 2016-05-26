package com.ms.model;

import java.io.Serializable;

public class Seller implements Serializable{
	/**
	 *  商家实体类
	 * @author jiachao
	 */
	private static final long serialVersionUID = 1L;

	private String sellerId;
	private String memberId;
	private String gvmId;
	private String orderId;
	private String sellerName;
	private Order order;
	private String status;
	private String a;
	private String b;
	
	
	public Seller() {
		super();
	}
	public Seller(String sellerId, String memberId, String gvmId,
			String orderId, String sellerName, Order order, String status,
			String a, String b) {
		super();
		this.sellerId = sellerId;
		this.memberId = memberId;
		this.gvmId = gvmId;
		this.orderId = orderId;
		this.sellerName = sellerName;
		this.order = order;
		this.status = status;
		this.a = a;
		this.b = b;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getGvmId() {
		return gvmId;
	}
	public void setGvmId(String gvmId) {
		this.gvmId = gvmId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
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
		return "Seller [sellerId=" + sellerId + ", memberId=" + memberId
				+ ", gvmId=" + gvmId + ", orderId=" + orderId + ", sellerName="
				+ sellerName + ", order=" + order + ", status=" + status
				+ ", a=" + a + ", b=" + b + "]";
	}
	
	
	
}
