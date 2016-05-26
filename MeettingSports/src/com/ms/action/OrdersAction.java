package com.ms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ms.dao.OrdersDao;
import com.ms.dao.MemberDao;
import com.ms.dao.impl.OrdersDaoImpl;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Order;
import com.ms.model.Member;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class OrdersAction extends ActionSupport implements ModelDriven<Member> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Member getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


