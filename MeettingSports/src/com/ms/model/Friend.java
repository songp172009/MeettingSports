package com.ms.model;

import java.io.Serializable;

public class Friend implements Serializable {

	/**
	 * @author jiachao
	 */
	private static final long serialVersionUID = 2818610177419977470L;
	
    private String id;
	private String userId;
	private String friendsId;
	
	//构造方法
	public Friend() {
		super();
	}

	public Friend(String id, String userId, String friendsId) {
		super();
		this.id = id;
		this.userId = userId;
		this.friendsId = friendsId;
	}

	//getter和setter方法
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFriendsId() {
		return friendsId;
	}

	public void setFriendsId(String friendsId) {
		this.friendsId = friendsId;
	}

	@Override
	public String toString() {
		return "Friends [id=" + id + ", userId=" + userId + ", friendsId="
				+ friendsId + "]";
	}
	
}
