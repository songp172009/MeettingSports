package com.ms.model;

import java.io.Serializable;
import java.util.Date;

public class Gvm implements Serializable {

	/**
	 * @author jiachao
	 * 场馆实体类
	 */
	private static final long serialVersionUID = 1L;
	
	private String gvmId;//场馆名称
	private String classId;//场馆类别
	private String gvmIntroduce;//场馆介绍
	private String gvmBrand;//场馆品牌
	private String imageId;//场馆图片地址
	private float marketPrice;//场馆市场价格
	private float memberPrice;//场馆会员价格
	private Integer gvmUnit;//场馆数量
	private boolean isHot;//是否热销
	private boolean isDiscount;//是否特价
	private Date addDate;//上架日期
	private String gvmAddress;//场馆地址
	private String starLevel;//场馆星级
	private String commentId;//评论
	private String a1;//
	private String a2;
	public Gvm() {
		super();
	}
	public Gvm(String gvmId, String classId, String gvmIntroduce,
			String gvmBrand, String imageId, float marketPrice,
			float memberPrice, Integer gvmUnit, boolean isHot,
			boolean isDiscount, Date addDate, String gvmAddress,
			String starLevel, String commentId, String a1, String a2) {
		super();
		this.gvmId = gvmId;
		this.classId = classId;
		this.gvmIntroduce = gvmIntroduce;
		this.gvmBrand = gvmBrand;
		this.imageId = imageId;
		this.marketPrice = marketPrice;
		this.memberPrice = memberPrice;
		this.gvmUnit = gvmUnit;
		this.isHot = isHot;
		this.isDiscount = isDiscount;
		this.addDate = addDate;
		this.gvmAddress = gvmAddress;
		this.starLevel = starLevel;
		this.commentId = commentId;
		this.a1 = a1;
		this.a2 = a2;
	}
	public String getGvmId() {
		return gvmId;
	}
	public String getClassId() {
		return classId;
	}
	public String getGvmIntroduce() {
		return gvmIntroduce;
	}
	public String getGvmBrand() {
		return gvmBrand;
	}
	public String getImageId() {
		return imageId;
	}
	public float getMarketPrice() {
		return marketPrice;
	}
	public float getMemberPrice() {
		return memberPrice;
	}
	public Integer getGvmUnit() {
		return gvmUnit;
	}
	public boolean isHot() {
		return isHot;
	}
	public boolean isDiscount() {
		return isDiscount;
	}
	public Date getAddDate() {
		return addDate;
	}
	public String getGvmAddress() {
		return gvmAddress;
	}
	public String getStarLevel() {
		return starLevel;
	}
	public String getCommentId() {
		return commentId;
	}
	public String getA1() {
		return a1;
	}
	public String getA2() {
		return a2;
	}
	public void setGvmId(String gvmId) {
		this.gvmId = gvmId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public void setGvmIntroduce(String gvmIntroduce) {
		this.gvmIntroduce = gvmIntroduce;
	}
	public void setGvmBrand(String gvmBrand) {
		this.gvmBrand = gvmBrand;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public void setMarketPrice(float marketPrice) {
		this.marketPrice = marketPrice;
	}
	public void setMemberPrice(float memberPrice) {
		this.memberPrice = memberPrice;
	}
	public void setGvmUnit(Integer gvmUnit) {
		this.gvmUnit = gvmUnit;
	}
	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}
	public void setDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public void setGvmAddress(String gvmAddress) {
		this.gvmAddress = gvmAddress;
	}
	public void setStarLevel(String starLevel) {
		this.starLevel = starLevel;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	public void setA2(String a2) {
		this.a2 = a2;
	}
	@Override
	public String toString() {
		return "Gvm [gvmId=" + gvmId + ", classId=" + classId
				+ ", gvmIntroduce=" + gvmIntroduce + ", gvmBrand=" + gvmBrand
				+ ", imageId=" + imageId + ", marketPrice=" + marketPrice
				+ ", memberPrice=" + memberPrice + ", gvmUnit=" + gvmUnit
				+ ", isHot=" + isHot + ", isDiscount=" + isDiscount
				+ ", addDate=" + addDate + ", gvmAddress=" + gvmAddress
				+ ", starLevel=" + starLevel + ", commentId=" + commentId
				+ ", a1=" + a1 + ", a2=" + a2 + "]";
	}
	
	

}
