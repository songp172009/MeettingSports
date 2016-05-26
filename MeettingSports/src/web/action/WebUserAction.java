package web.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.ms.dao.MemberDao;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Member;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class WebUserAction extends ActionSupport implements ModelDriven<Member>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		//用户登录处理
		MemberDao ud=new MemberDaoImpl();
		public String userLogin(){
			String result;
			String username=ServletActionContext.getRequest().getParameter("username");
			String password=ServletActionContext.getRequest().getParameter("password");
			Member user=ud.getMember(username);
			Gson gson=new Gson();
			
			Map<String,String> map=new HashMap<String,String>();
			if(user==null){
				map.put("Response", "用户不存在");
				map.put("code", "2");
				result=gson.toJson(map);
			}else if(!user.getPassword().equals(password)){
				map.put("Response", "密码错误");
				map.put("code", "3");
				result=gson.toJson(map);
			}else{
				map.put("Response", "成功");
				map.put("code", "1");
				result=gson.toJson(map);
			}
			
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
			System.out.println(user);
			System.out.println(user.getPassword());
			System.out.println(password);
			System.out.println(result);
			return SUCCESS;
		}
		//修改密码
		public void password_change() {
			Gson gson = new Gson();
			Map<String, String> map = new HashMap<String, String>();
			String userName=ServletActionContext.getRequest().getParameter("username");
			String password=ServletActionContext.getRequest().getParameter("password");
			if (userName == null || password == null) {
				map.put("code", "2");
				map.put("Response", "手机号码或密码不能为空");

			} else {
				String pw_regex = "^[^\\s]{6,16}$";
				if (Pattern.compile(pw_regex).matcher(password).matches()) {
					ud.updateMemberrPassword(userName, password);
						map.put("code", "1");
						map.put("Response", "修改成功");
				}else if(ud.getMember(userName)==null){
					
					map.put("code", "2");
					map.put("Response", "手机号码不正确");
				} else {
					map.put("code", "2");
					map.put("Response", "密码格式不正确");
				}

			}
			String result = gson.toJson(map);
			HttpServletResponse response=ServletActionContext.getResponse();
			//设置编码格式及信息类型，缓存
			response.setContentType("application/json;charset=utf-8");
			response.setHeader("cache-control", "no-cache");

			try {
				PrintWriter out=response.getWriter();
				out.print(result);
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		//忘记密码
		public void remember() {
			String result;
			Gson gson = new Gson();
			
			Map<String, String> map = new HashMap<String, String>();
			String userName=ServletActionContext.getRequest().getParameter("username");
			Member user=ud.getMember(userName);
			// 判断参数是否为空
			if (userName == null) {
				map.put("code", "2");
				map.put("Response", "用户名错误");
			} else {

				// 判断用户是否存在
				if (user == null) {
					map.put("code", "2");
					map.put("Response", "手机号码错误，不存在");

				} else {
					map.put("code", "1");
					map.put("Response", "成功");
				}

			}

			result = gson.toJson(map);
			
			HttpServletResponse response=ServletActionContext.getResponse();
			//设置编码格式及信息类型，缓存
			response.setContentType("application/json;charset=utf-8");
			response.setHeader("cache-control", "no-cache");

			try {
				PrintWriter out=response.getWriter();
				out.print(result);
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(user.toString());

		}
		
		
		// 注册
		public void register() {
			String result;
			Member user = new Member();
			String userName=ServletActionContext.getRequest().getParameter("username");
			String password=ServletActionContext.getRequest().getParameter("password");
			user.setMemberId(userName);
			user.setPhone(userName);
			System.out.println(userName);
			System.out.println(password);
			user.setPassword(password);
			user.setRegTime(new Date());

			Gson gson = new Gson();
			Map<String, String> map = new HashMap<String, String>();

			if (userName == null || password == null) {
				map.put("code", "3");
				map.put("Response", "手机或密码格式不正确");
			} else {

				// 判断用户是否注册
				if (ud.getMember(userName)!=null) {
					map.put("code", "3");
					map.put("Response", "手机号码已经注册");
				} else {

					// 验证用户手机号码
					String regex = "1([\\d]{10})";
					// 验证用户手机密码格式
					if (Pattern.compile(regex).matcher(userName).matches()) {
						
						String pw_regex = "^[^\\s]{6,16}$";
						
						if (Pattern.compile(pw_regex).matcher(password).matches()) {
							
							ud.insertMember(user);
							map.put("code", "1");
							map.put("Response", "注册成功");
							
						} else {
							
							map.put("code", "3");
							map.put("Response", "密码格式不正确");
						}
					} else {
						map.put("code", "2");
						map.put("Response", "手机号码格式不正确");
					}
				}

			}

			result = gson.toJson(map);
			HttpServletResponse response=ServletActionContext.getResponse();
			//设置编码格式及信息类型，缓存
			response.setContentType("application/json;charset=utf-8");
			response.setHeader("cache-control", "no-cache");

			try {
				PrintWriter out=response.getWriter();
				out.print(result);
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(user.toString());

		}

		//个人信息查看
		public String findUser(){
			MemberDao ud=new MemberDaoImpl();
			Gson gson=new Gson();
			String username=ServletActionContext.getRequest().getParameter("username");
			Member user=ud.getMember(username);
			
			String result=gson.toJson(user);
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
		
		//完善个人信息
		public String addInfo() throws JSONException, ParseException{
//			String json=ServletActionContext.getRequest().getParameter("test.json");

			String ui=ServletActionContext.getRequest().getParameter("phone");
			MemberDao ud=new MemberDaoImpl();
			Member user=new Member();
			user=ud.getMember(ui);
			System.out.println(user);
			
			File file=new File("E:/javaweb/web/Ms/WebRoot/data/test.json");
			StringBuilder sb=new StringBuilder();
			Scanner in=null;
			 try {
				in=new Scanner(file,"utf-8");
				while(in.hasNext()){
					sb.append(in.nextLine());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(in!=null){
					in.close();
				}
			}
			 System.out.println(sb.toString());
			 JSONObject jo = new JSONObject(sb.toString());
		     JSONArray ja = jo.getJSONArray("User");
//			 String jsonStr = jo.getString("User");
//		        User emp = new User();
//		        try {
//					JsonHelper.toJavaBean(emp, jsonStr);
//					System.out.println("name: " + emp.getNick() + " sex: " + emp.getSex()
//			                + " password: " + emp.getPassword());
//
//				} catch (JSONException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
		        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				java.sql.Timestamp st=new java.sql.Timestamp(sdf.parse(ja.getJSONObject(0).getString("birth")).getTime());
				System.out.println("data:" +st);
		        System.out.println("data:" +st+"name: " + ja.getJSONObject(0).getString("userId")
		                + "phone: " + ja.getJSONObject(0).getString("phone"));
		        user.setMemberId(ja.getJSONObject(0).getString("userId"));
		        user.setRealName(ja.getJSONObject(0).getString("nick"));

		        user.setBirth(st);

		        user.setEmail(ja.getJSONObject(0).getString("email"));
		        user.setAddress(ja.getJSONObject(0).getString("address"));
		        user.setSex(ja.getJSONObject(0).getString("sex"));
		        user.setIntroduces(ja.getJSONObject(0).getString("introduces"));
		        user.setMemberUrl(ja.getJSONObject(0).getString("headPicture"));
		        user.setHabits(ja.getJSONObject(0).getString("skill"));
		        ud.updataMemberInfo(user);
		        System.out.println(ud.getMember(ui));
		        
		        HttpServletResponse response=ServletActionContext.getResponse();
				//设置编码格式及信息类型，缓存
				response.setContentType("application/json;charset=utf-8");
				response.setHeader("cache-control", "no-cache");
				Gson gson=new Gson();
				Map<String,String> map=new HashMap<String,String>();
				map.put("code", "1");
				map.put("Response", "成功");
				String result=gson.toJson(map);
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
		@Override
		public Member getModel() {
			// TODO Auto-generated method stub
			return null;
		}
}
