package Test;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;

import com.ms.dao.OrdersDao;
import com.ms.dao.MemberDao;
import com.ms.dao.impl.OrdersDaoImpl;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Order;

public class TestOrders {
	//单个订单
//	@Test
//	public void oneorders(){
//		
//		OrdersDao od=new OrdersDaoImpl();
//		Order order=od.getOrderInfo("1");
//		if(order==null){
//			System.out.println("未查到结果");
//		}else{
//			
//			System.out.println(order);
//		}
//		System.out.println();
//	}
	//多个订单
//	@Test
//	public void allOrders(){
//		OrdersDao od=new OrdersDaoImpl();
//		List<Order> list=od.getAllOrders("meimei");
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
//	}
	//插入订单
//	@Test
//	public void setOrders() throws ParseException{
//		OrdersDao od=new OrdersDaoImpl();
//		Order order=new Order();
//		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
////		Date st=new Date("2016-01-08 00:00:00");
////		java.sql.Timestamp st=new java.sql.Timestamp(sdf.parse("2016-01-08 00:00:00").getTime());
////		System.out.println(st);
////		order.setOrderId("9");
//		order.setOrderId("9");
//		order.setMemberId("jiacs");
//		order.setPayType("支付宝");
////		order.getOrderDate(st);
//		order.setPayStatus("2");
//		order.setPrices(100);
//		order.setCount(3);
//		order.setRemarks("已提交");
//		order.setTotalPrice(100000);
//		order.isInConfirm();
//		order.isPayment();
//		System.out.println(order);
//		od.insertOrders(order);
//		System.out.println();
////		System.out.println(order);
//		
//	}
	//删除操作
//	@Test
//	public void deleteOrder(){
//		OrdersDao od=new OrdersDaoImpl();
//		od.deleteOrders("1");
//		Order order=od.getOrderInfo("1");
//		
//		if(order==null){
//			System.out.println("删除成功");
//		}else {
//			System.out.println("删除失败");
//		}
//	}
	//批量删除操作
		@Test
		public void allDeleteOrders(){
			OrdersDao od=new OrdersDaoImpl();
			String str="67";
			Order order=new Order();
			for(int i=0;i<str.length();i++){
				System.out.println(str.charAt(i));
				String st=String.valueOf(str.charAt(i));
				order=od.getOrderInfo(st);
				System.out.println(order);
			}
			od.deleteAllOrders(str);
			
			for(int i=0;i<str.length();i++){
				System.out.println(str.charAt(i));
				order=od.getOrderInfo(String.valueOf(str.charAt(i)));
				if(order==null){
					System.out.println("删除成功");
				}else {
					System.out.println("删除失败");
				}
			}
		}
	
	
	//更新操作
//	@Test
//	public void updataOrders(){
//		MemberDao ud=new MemberDaoImpl();
//		OrdersDao od=new  OrdersDaoImpl();;
//		Order order=od.getOrderInfo("7");
//		float price= order.getPrices();
//		System.out.println(price);
//		System.out.println(order);
//		order.setPrices(138);
//		order.setOrderId("1");
////		System.out.println(order.getPrices());
//		order.setCount(119);
//		System.out.println(order);
//		od.updataOrders(order);
//		System.out.println("count:"+od.getOrderInfo("1").getCount());
//		System.out.println("prices:"+od.getOrderInfo("1").getPrices());
//	}
}
