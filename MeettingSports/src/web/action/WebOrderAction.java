package web.action;

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

public class WebOrderAction extends ActionSupport implements ModelDriven<Member> {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




		//用户订单查询
		//根据orderid订单详情
		public String orderInfo(){
			OrdersDao od=new OrdersDaoImpl();
			String oi=ServletActionContext.getRequest().getParameter("ordersid");
			System.out.println(oi);
			Order order=od.getOrderInfo(oi);
			System.out.println(order);
			Gson gson=new  GsonBuilder().serializeNulls().create();
			String orders=gson.toJson(order);

			HttpServletResponse response=ServletActionContext.getResponse();
			//设置编码格式及信息类型，缓存
			response.setContentType("application/json;charset=utf-8");
			response.setHeader("cache-control", "no-cache");

			try {
				PrintWriter out=response.getWriter();
				//将信息写入reponse中
				out.print(orders);
				//清空缓存，关闭
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

			System.out.println(orders);
			return SUCCESS;
		}
		//根据userid查看用户所有订单
		public String orderAllInfo(){
			OrdersDao od=new OrdersDaoImpl();
			MemberDao ud=new MemberDaoImpl();
			Gson gson=new Gson();
			String ui=ServletActionContext.getRequest().getParameter("userid");
			Member user=ud.getMember(ui);
			if(user==null){

				System.out.println("用户不存在");
				Map<String,String> map=new HashMap<String, String>();
				map.put("code", "1");
				map.put("Response", "用户不存在");
				System.out.println(gson.toJson(map));
			}else {

				String orders=gson.toJson(od.getAllOrders(ui));

				HttpServletResponse response=ServletActionContext.getResponse();
				//设置编码格式及信息类型，缓存
				response.setContentType("application/json;charset=utf-8");
				response.setHeader("cache-control", "no-cache");

				try {
					PrintWriter out=response.getWriter();
					//将信息写入reponse中
					out.print(orders);
					//清空缓存，关闭
					out.flush();
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}


				System.out.println(orders);
				return orders;
			}
			//				List<Orders> orders=od.getAllOrders(ud);
			//				Iterator<Orders> it=orders.iterator();
			//				while(it.hasNext()){
			//					System.out.println(it.next());
			//					Gson gson=new GsonBuilder().serializeNulls().create();
			//					System.out.println(gson.toJson(it.next()));
			//				}
			return SUCCESS;
		}

		//订单支付提交
		public String commentOrders() throws ParseException{

			OrdersDao od=new OrdersDaoImpl();
			Order order=new Order();
			
			SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

			java.sql.Timestamp st=new java.sql.Timestamp(sdf.parse("2016-01-08 00:00:00").getTime());
			System.out.println(st);
			//				order.setOrderId("9");
//			order.setFromUser("meimei");
//			order.setToSeller("jc");
//			order.setSportId("2");
//			order.setOrderTime(st);
//			order.setPayStatus("2");
//			order.setStartTime(st);
//			order.setPrices(100);
//			order.setCount(3);
			//				order.setRemarks("已提交");
			System.out.println(order);
			//插入订单
			od.insertOrders(order);
			Gson gson=new Gson();
			
			Map<String,String> map=new HashMap<String,String>();
			//获取插入的订单
			Order oe=	od.getOrderInfo(order.getOrderId());
			if(oe==null){
				System.out.println("订单提交失败");
				map.put("code", "false");
				map.put("Response", "失败");
			}else{
				map.put("code", "true");
				map.put("Response", "成功");
				System.out.println("订单提交成功");
			}
			//				System.out.println(order);
			String result = gson.toJson(map);
			//获取response对象
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
			return SUCCESS;
		}
		
		//申请退款
		public String reCount(){
			String username=ServletActionContext.getRequest().getParameter("userid");
			String password=ServletActionContext.getRequest().getParameter("password");
			String ordersid=ServletActionContext.getRequest().getParameter("orderid");
			
			MemberDao ud=new MemberDaoImpl();
			OrdersDao od=new OrdersDaoImpl();
			Member user=ud.getMember(username);
			Gson gson=new Gson();
			Map<String,String> map=new HashMap<String,String>();
			if(user==null){
				map.put("code", "2");
				map.put("Response", "用户不存在");
			}else if(!user.getPassword().equals(password)){
				map.put("code", "3");
				map.put("Response", "密码错误");
			}else {
				Order order=od.getOrderInfo(ordersid);
				float price= order.getPrices();
				System.out.println(price);
				order.setPrices(0);
				order.setCount(0);
				od.updataOrders(order);
				System.out.println(od.getOrderInfo(ordersid));
				map.put("code", "1");
				map.put("Response", "成功");
			}
			
			String result=gson.toJson(map);
			//获取response对象
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
			return SUCCESS;
		}
	

	
	
	public Member getModel() {
		// TODO Auto-generated method stub
		return null;
	}
}
