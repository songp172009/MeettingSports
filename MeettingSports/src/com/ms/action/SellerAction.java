package com.ms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.ms.dao.MemberDao;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Member;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SellerAction extends ActionSupport implements ModelDriven<Member> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	public String level(){
		return SUCCESS;
	}
	public String use(){
		return SUCCESS;
	}
	public String common(){
		return SUCCESS;
	}
}
