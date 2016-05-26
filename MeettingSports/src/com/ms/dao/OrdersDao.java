package com.ms.dao;

import java.util.List;

import com.ms.common.BaseDao;
import com.ms.model.Order;


public interface OrdersDao extends BaseDao<Order>{
	//根据用户名获取全部订单
	public abstract List<Order> getAllOrders(String memberId);
	//根据订单号获取订单详情
	public abstract Order getOrderInfo(String string);
	//插入订单
	public abstract void insertOrders(Order order);
	//删除订单
	public abstract void deleteOrders(String order);
	//批量删除订单
	public abstract void deleteAllOrders(String... params);
	//更新订单
	public abstract void updataOrders(Order order);
}
