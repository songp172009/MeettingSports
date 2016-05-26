package web.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.ms.dao.MemberDao;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Seller;
import com.ms.model.Member;
import com.ms.service.SellerService;
import com.ms.service.impl.SellerServiceImpl;

public class WebIndexAction {
	//获取首页banner图
	public void getBanner(){
		String result = null;
		MemberDao ud=new MemberDaoImpl();
		List<Member> seller=ud.getAllSeller();
		Gson gson=new Gson();
		Map<String,String> map=new HashMap<String,String>();
		for(int i=0;i<seller.size();i++){
			String picture=seller.get(i).getMemberUrl();
			String sellername=seller.get(i).getMemberId();
			System.out.println(seller.get(i));
			String sellerpicture="picture"+String.valueOf(i);
			String username=seller.get(i).getRealName();
			map.put(sellername, username);
			map.put(sellerpicture,picture);
		}
		System.out.println(map);
		result=gson.toJson(map);
		System.out.println(result);
		HttpServletResponse response=ServletActionContext.getResponse();
		//设置编码格式及信息类型，缓存
		response.setContentType("application/json;charset=utf-8");
		response.setHeader("cache-control", "no-cache");

		try {
			PrintWriter out=response.getWriter();
			//将信息写入reponse中
			out.print(result);
			//清空缓存，关闭
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	public void sellerList(){
		SellerService ss=new SellerServiceImpl();
		Seller seller=ss.getSellerList();
		System.out.println(seller);
		Gson gson=new Gson();
		String result=gson.toJson(seller);
		HttpServletResponse response=ServletActionContext.getResponse();
		//设置编码格式及信息类型，缓存
		response.setContentType("application/json;charset=utf-8");
		response.setHeader("cache-control", "no-cache");

		try {
			PrintWriter out=response.getWriter();
			//将信息写入reponse中
			out.print(result);
			//清空缓存，关闭
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
	}
	//搜索
	public void serachInfo(){
		MemberDao ud=new MemberDaoImpl();
		Seller seller=new Seller();
		String keyword=ServletActionContext.getRequest().getParameter("keyword");
		List<Member> user=ud.searchSeller(keyword);
		System.out.println(user);
//		seller.setPicture(user.get(0).getMemberUrl());
//		seller.setPrices(user.get(0).getPhone());
//		seller.setSellerDesc(user.get(0).getAddress());
//		seller.setSellerName(user.get(0).getName());
		Gson gson=new Gson();
		String result=gson.toJson(seller);
		HttpServletResponse response=ServletActionContext.getResponse();
		//设置编码格式及信息类型，缓存
		response.setContentType("application/json;charset=utf-8");
		response.setHeader("cache-control", "no-cache");

		try {
			PrintWriter out=response.getWriter();
			//将信息写入reponse中
			out.print(result);
			//清空缓存，关闭
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
