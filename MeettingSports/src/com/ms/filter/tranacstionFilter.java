//package com.ms.filter;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.ms.utils.ConnectionContext;
//import com.ms.utils.JDBCUtils;
//import com.opensymphony.xwork2.ActionInvocation;
//import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
//
//public class tranacstionFilter extends AbstractInterceptor {
//
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Override
//	public String intercept(ActionInvocation invocation) throws Exception {
//		
//		System.out.println("before invocation.invoke...");
//Connection connection = null;
//		
//		try {
//			
//			//1. 获取连接
//			connection = JDBCUtils.getConnection();
//			
//			//2. 开启事务
//			connection.setAutoCommit(false);
//			
//			//3. 利用 ThreadLocal 把连接和当前线程绑定
//			ConnectionContext.getInstance().bind(connection);
//			
//			//4. 把请求转给目标 Action
//			chain.doFilter(request, response);
//			
//			//5. 提交事务
//			connection.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//			//6. 回滚事务
//			try {
//				connection.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			
//			HttpServletResponse resp = (HttpServletResponse) response;
//			HttpServletRequest req = (HttpServletRequest) request;
//			resp.sendRedirect(req.getContextPath() + "/error-1.jsp");
//			
//		} finally{
//			//7. 解除绑定
//			ConnectionContext.getInstance().remove();
//			
//			//8. 关闭连接
//			JDBCUtils.release(connection);
//			
//		}
//		
//		//String result = invocation.invoke();
//		
//		System.out.println("after invocation.invoke...");
//		
//		return "success";
//	}
//}
