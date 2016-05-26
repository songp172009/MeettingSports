package com.ms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Position implements Serializable{

	/**
	 * 地理位置
	 * @author jiachao
	 */
	private static final long serialVersionUID = -2474415199685724259L;
	private String positionId;//
	private String locationName;//位置名
	private String longtitude;//经度
	private String latitude;//维度
	private String photos;
	private String gvmId;//商家名
	private Integer onlineStatus;//在线状态
	private String ip;
	private Date loginTime;//登录时间
	
	private Set<Member> user=new HashSet<Member>();

	public Position() {
		super();
	}

	public Position(String positionId, String locationName, String longtitude,
			String latitude, String photos, String gvmId, Integer onlineStatus,
			String ip, Date loginTime, Set<Member> user) {
		super();
		this.positionId = positionId;
		this.locationName = locationName;
		this.longtitude = longtitude;
		this.latitude = latitude;
		this.photos = photos;
		this.gvmId = gvmId;
		this.onlineStatus = onlineStatus;
		this.ip = ip;
		this.loginTime = loginTime;
		this.user = user;
	}

	public String getPositionId() {
		return positionId;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public String getGvmId() {
		return gvmId;
	}

	public void setGvmId(String gvmId) {
		this.gvmId = gvmId;
	}

	public Integer getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(Integer onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Set<Member> getUser() {
		return user;
	}

	public void setUser(Set<Member> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", locationName="
				+ locationName + ", longtitude=" + longtitude + ", latitude="
				+ latitude + ", photos=" + photos + ", gvmId=" + gvmId
				+ ", onlineStatus=" + onlineStatus + ", ip=" + ip
				+ ", loginTime=" + loginTime + ", user=" + user + "]";
	}

	
	
	
}
