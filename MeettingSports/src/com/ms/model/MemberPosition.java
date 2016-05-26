package com.ms.model;

import java.io.Serializable;

public class MemberPosition implements Serializable{
	
	/**
	 * 
	 * @author jiachao
	 */
	private static final long serialVersionUID = -7548926553575887030L;
	private String id;
	private String positionId;
	private String UserId;
	private String ai;
	
	
	
	public MemberPosition() {
		super();
	}
	public MemberPosition(String id, String positionId, String userId, String ai) {
		super();
		this.id = id;
		this.positionId = positionId;
		this.UserId = userId;
		this.ai = ai;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getAi() {
		return ai;
	}
	public void setAi(String ai) {
		this.ai = ai;
	}
	@Override
	public String toString() {
		return "UserPosition [id=" + id + ", positionId=" + positionId
				+ ", UserId=" + UserId + ", ai=" + ai + "]";
	}
	
}
