package com.ms.service.impl;

import java.util.List;

import com.ms.dao.MemberDao;
import com.ms.dao.OrdersDao;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.dao.impl.OrdersDaoImpl;
import com.ms.model.Seller;
import com.ms.model.Member;
import com.ms.service.SellerService;

public class SellerServiceImpl implements SellerService{
	//推荐商家列表
	@Override
	public Seller getSellerList() {
		MemberDao ud=new MemberDaoImpl();
		Seller seller=new Seller();
		OrdersDao od=new OrdersDaoImpl();
		List<Member> sa=ud.getAllSeller();
		seller.setGvmId(sa.get(0).getMemberUrl());
		seller.setSellerId(sa.get(0).getMemberId());
		seller.setSellerName(sa.get(0).getMemberId());
		seller.setOrder(od.getOrderInfo(sa.get(0).getMemberId()));
		seller.setOrderId(od.getOrderInfo(sa.get(0).getMemberId()).getOrderId());
		return seller;
	}

}
