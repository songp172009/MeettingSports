package com.ms.action;

import com.ms.model.Member;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<Member> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public Member getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	public String find(){
		return SUCCESS;
	}
	
	public String remove(){
		return SUCCESS;
	}
	
	public String update(){
		return SUCCESS;
	}
	
	public String add(){
		return SUCCESS;
	}
	public String search(){
		return SUCCESS;
	}
	
	
}
