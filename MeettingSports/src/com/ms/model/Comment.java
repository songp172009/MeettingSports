package com.ms.model;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {

	/**
	 * 评论
	 * @author jiachao
	 */
	private static final long serialVersionUID = 4087222812796186131L;

	private String commentId;
	private String memberName;//用户名
	private String sellerName;//买家名
	private Date inDate;//评论日期
	private String commentLevel;//评论星级
	private String content;//内容
	private String newComment;//新的评论
	private String reply;//回复
	private String gvmId;//评论场馆
	//构造方法
	public Comment() {
		super();
	}
	public Comment(String commentId, String memberName, String sellerName,
			Date inDate, String commentLevel, String content,
			String newComment, String reply, String gvmId) {
		super();
		this.commentId = commentId;
		this.memberName = memberName;
		this.sellerName = sellerName;
		this.inDate = inDate;
		this.commentLevel = commentLevel;
		this.content = content;
		this.newComment = newComment;
		this.reply = reply;
		this.gvmId = gvmId;
	}
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	public String getCommentLevel() {
		return commentLevel;
	}
	public void setCommentLevel(String commentLevel) {
		this.commentLevel = commentLevel;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNewComment() {
		return newComment;
	}
	public void setNewComment(String newComment) {
		this.newComment = newComment;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getGvmId() {
		return gvmId;
	}
	public void setGvmId(String gvmId) {
		this.gvmId = gvmId;
	}
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", memberName=" + memberName
				+ ", sellerName=" + sellerName + ", inDate=" + inDate
				+ ", commentLevel=" + commentLevel + ", content=" + content
				+ ", newComment=" + newComment + ", reply=" + reply
				+ ", gvmId=" + gvmId + "]";
	}
	
		
}
