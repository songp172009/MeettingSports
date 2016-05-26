package com.ms.model;

import java.io.Serializable;

public class GvmImage implements Serializable {

	/**
	 * 图片实体类
	 * @author jiachao
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String imageId;
	private String imageName;
	private String imageUrl;
	
	
	public GvmImage() {
		super();
	}
	public GvmImage(String imageId, String imageName, String imageUrl) {
		super();
		this.imageId = imageId;
		this.imageName = imageName;
		this.imageUrl = imageUrl;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "GvmImage [imageId=" + imageId + ", imageName=" + imageName
				+ ", imageUrl=" + imageUrl + "]";
	}
	
	
}
