package com.ms.model;

import java.io.Serializable;

public class PayType implements Serializable{

	/**
	 * @author jiachao
	 */
	private static final long serialVersionUID = 1L;
	
	private String payId;
	private String payWay;
	private String classId;
	private String a1;
	
	
	
	public PayType() {
		super();
	}
	public PayType(String payId, String payWay, String classId, String a1) {
		super();
		this.payId = payId;
		this.payWay = payWay;
		this.classId = classId;
		this.a1 = a1;
	}
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getPayWay() {
		return payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	@Override
	public String toString() {
		return "PayType [payId=" + payId + ", payWay=" + payWay + ", classId="
				+ classId + ", a1=" + a1 + "]";
	}
	
	

}
