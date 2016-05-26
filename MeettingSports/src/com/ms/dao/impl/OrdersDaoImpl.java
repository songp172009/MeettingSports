package com.ms.dao.impl;

import java.util.List;

import com.ms.common.BaseDaoImpl;
import com.ms.dao.OrdersDao;
import com.ms.model.Order;
import java.lang.Long;

public class OrdersDaoImpl extends BaseDaoImpl<Order> implements OrdersDao{

	//获取全部订单
	@Override
	public List<Order> getAllOrders(String memberId) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM orders WHERE memberId=?";
		return queryForList(sql,memberId);
	}


	//获取订单详情
	@Override
	public Order getOrderInfo(String Orderid) {
		// TODO Auto-generated method stub
		String sql = "SELECT*FROM orders WHERE orderId=?";
			Order order=query(sql,Orderid);
//			System.out.println(order);
		return order;
	}


	//插入订单
	@Override
	public void insertOrders(Order order) {
		// TODO Auto-generated method stub
		String sql="insert into orders (orderId,memberId,orderData,payStatus,prices,count,remarks,payType,totalPrice,isPayment,isConfirm)"
				+ "VALUE"+"(?,?,?,?,?,?,?,?,?,?,?)";
		insert(sql,order.getOrderId(),order.getMemberId(),order.getOrderDate(),order.getPayStatus(),order.getPrices(),
				order.getCount(),order.getRemarks(),order.getPayType(),order.getTotalPrice(),order.isPayment(),order.isInConfirm());
		
//		order.setOrderId(String.valueOf(orderId.intValue()));
	}

	//删除订单
	@Override
	public void deleteOrders(String orderId) {
		// TODO Auto-generated method stub
		String sql="DELETE  FROM orders where orderId=?";
		update(sql,orderId);
	}

	//批量删除订单
	@Override
	public void deleteAllOrders(String... params) {
		// TODO Auto-generated method stub
		String sql="DELETE  FROM orders where orderId in (?)";

		char[] ch=params[0].toCharArray();
		for(int i=0;i<ch.length;i++){
			update(sql,String.valueOf(ch[i]));
		}
	}

	//订单提交
	@Override
	public void updataOrders(Order order) {
		// TODO Auto-generated method stub
		String sql="update orders set count = ?, prices = ? where orderId= ?;";
//		System.out.println(order.getCount());
		update(sql,order.getCount(),order.getPrices(),order.getOrderId());
	}





}
