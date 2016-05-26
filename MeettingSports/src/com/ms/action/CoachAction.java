package com.ms.action;

import com.ms.model.Member;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CoachAction extends ActionSupport implements ModelDriven<Member>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @author jiachao
	 * 
	 */
	@Override
	public Member getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String comment(){
		return SUCCESS;
	}
	
	
	public String account(){
		return SUCCESS;
	}
	//订单管理
	public String Omanage(){
		
		return SUCCESS;
	}
	public String Cmanage(){
		return SUCCESS;
	}
	public String del(){
		return SUCCESS;
	}
	
}
