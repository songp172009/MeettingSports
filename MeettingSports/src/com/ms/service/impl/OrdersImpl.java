package com.ms.service.impl;

import com.ms.dao.OrdersDao;
import com.ms.dao.impl.OrdersDaoImpl;
import com.ms.model.Order;
import com.ms.service.OrdersService;

public class OrdersImpl implements OrdersService{

	
	OrdersDao ordersdao=new OrdersDaoImpl();
//	@Override
//	public boolean getOrderExist(String orders) {
//		// TODO Auto-generated method stub
//		
//		int count=0;
//		String sql="select fromUser from Orders where ordersId=orders;";
//		Orders od=ordersdao.query(sql, orders);
//		if(od!=null){
//			
//			System.out.println(od.toString());
//			return true;
//			
//		}
//		return false;
//	}

}
