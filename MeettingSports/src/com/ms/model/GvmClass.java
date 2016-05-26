package com.ms.model;

import java.io.Serializable;

public class GvmClass implements Serializable{

	/**
	 * @author jiachao
	 */
	private static final long serialVersionUID = 1L;

	
	private String classId;
	private String catagoryUrl;//商品商标
	private String a1;
	
	public GvmClass() {
		super();
	}

	public GvmClass(String classId, String catagoryUrl, String a1) {
		super();
		this.classId = classId;
		this.catagoryUrl = catagoryUrl;
		this.a1 = a1;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getCatagoryUrl() {
		return catagoryUrl;
	}

	public void setCatagoryUrl(String catagoryUrl) {
		this.catagoryUrl = catagoryUrl;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	@Override
	public String toString() {
		return "GvmClass [classId=" + classId + ", catagoryUrl=" + catagoryUrl
				+ ", a1=" + a1 + "]";
	}
	
	
}
