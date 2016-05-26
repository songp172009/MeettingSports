package com.ms.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

	/**
	 * 订单实体类
	 * @author jiachao
	 */
	private static final long serialVersionUID = -8984609099523643484L;
	
	private String orderId;//订单Id
	private String memberId;//购物人Id
	private String remarks;//备注
	private Date orderDate;//交易时间
	private float prices;//交易金额
	private String payStatus;//交易状态
	private Integer count;	//交易总数
	private float totalPrice;//总价
	private String payType;//付款方式
	private boolean inConfirm;//是否确认
	private boolean isPayment;//是否付款
	private String a1;
	//构造方法
	public Order() {
		super();
	}
	public Order(String orderId, String memberId, String remarks,
			Date orderDate, float prices, String payStatus, Integer count,
			float totalPrice, String payType, boolean inConfirm,
			boolean isPayment, String a1) {
		super();
		this.orderId = orderId;
		this.memberId = memberId;
		this.remarks = remarks;
		this.orderDate = orderDate;
		this.prices = prices;
		this.payStatus = payStatus;
		this.count = count;
		this.totalPrice = totalPrice;
		this.payType = payType;
		this.inConfirm = inConfirm;
		this.isPayment = isPayment;
		this.a1 = a1;
	}
	public String getOrderId() {
		return orderId;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getRemarks() {
		return remarks;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public float getPrices() {
		return prices;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public Integer getCount() {
		return count;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public String getPayType() {
		return payType;
	}
	public boolean isInConfirm() {
		return inConfirm;
	}
	public boolean isPayment() {
		return isPayment;
	}
	public String getA1() {
		return a1;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public void setPrices(float prices) {
		this.prices = prices;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public void setInConfirm(boolean inConfirm) {
		this.inConfirm = inConfirm;
	}
	public void setPayment(boolean isPayment) {
		this.isPayment = isPayment;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", memberId=" + memberId
				+ ", remarks=" + remarks + ", orderDate=" + orderDate
				+ ", prices=" + prices + ", payStatus=" + payStatus
				+ ", count=" + count + ", totalPrice=" + totalPrice
				+ ", payType=" + payType + ", inConfirm=" + inConfirm
				+ ", isPayment=" + isPayment + ", a1=" + a1 + "]";
	}
		

	
}
