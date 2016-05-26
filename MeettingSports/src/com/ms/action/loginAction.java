package com.ms.action;



import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.ms.dao.MemberDao;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Member;
import com.ms.model.Role;
import com.ms.service.MemberService;
import com.ms.service.RoleService;
import com.ms.service.impl.MemberServiceImpl;
import com.ms.service.impl.RoleServiceImpl;
import com.ms.utils.MailUitls;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class loginAction extends ActionSupport  implements ModelDriven<Member> {

	private static final long serialVersionUID = 6986972776273135972L;

	/**
	 * @author jiachao
	 * 
	 */
	MemberService MemberService=new MemberServiceImpl();
	
	private String validate_code;
	
	

	private Member model = new Member();

	/**
	 * 登陆处理
	 * @return
	 */
	
	public String check()  throws UnsupportedEncodingException {
		processcharset();

		ActionContext actionContext=ActionContext.getContext();
		Map<String, Object> sessionMap=actionContext.getSession();
		String code=(String) sessionMap.get("piccode");
		Map<String, Object> parameters = actionContext.getParameters();
		System.out.println(((String[])parameters.get("validate_code"))[0]);
		System.out.println(code);
		System.out.println((code.equalsIgnoreCase(validate_code)));
		System.out.println(model.getPassword());
		
		
		System.out.println(model.getMemberId());
		Member loginUser = MemberService.findPersonByPhoneOrMemberId(model.getMemberId());
//		System.out.println(loginUser.toString());
		if(loginUser==null){
			addFieldError("username", "用户不存在！");
			return INPUT;
		}else
		if(loginUser.getPassword().equals(model.getPassword())==false){
			addFieldError("username", "密码错误！");
			return INPUT;
		}else if (code.equalsIgnoreCase(validate_code)==false){
			addFieldError("username", "验证码错误！");
			return INPUT;
		}else{
			RoleService roleService = new RoleServiceImpl();
			List<Role> listRole = roleService.findAllRoleType(loginUser.getMemberId());
			if (listRole.isEmpty()) {
				return ERROR;
			} else {
				Role role = null;
				for (int i = 0; i < listRole.size(); i++) {
					role = (Role) listRole.get(i);
					sessionMap.put("userRole", role);
					sessionMap.put("User", loginUser);
					System.out.println(role.toString());
				}
			}
		}
		return SUCCESS;
	}

//	public boolean equalsString(Object obj,String str){
//		if(obj==str){
//			return true;
//		}
//		return false;
//	}
	
	public void validate() {

		if (model.getMemberId() == null || "".equals(model.getMemberId())) {
			this.addFieldError("username", "用户名不能为空！");
		}
		if (model.getPassword() == null || "".equals(model.getPassword())) {
			this.addFieldError("username", "密码不能为空！");
		}

	}

	public String remember(){
		
		return SUCCESS;	
	}
	
	//注册
	public String register(){
		
		return "register";
	}

	public String registersuccess(){
		MemberDao md=new MemberDaoImpl();
		Member member=new Member();
		System.out.println(model);
//		member.setPhone(model.getEmail());
//		member.setMemberId(model.getPassword());
//		member.setPassword(model.getPassword());
		String email=ServletActionContext.getRequest().getParameter("email");
		String password=ServletActionContext.getRequest().getParameter("password");
		String repassword=ServletActionContext.getRequest().getParameter("repassword");
		String yanzhengma=ServletActionContext.getRequest().getParameter("yanzhengma");
		
		member.setPhone(yanzhengma);
		member.setEmail(email);
		member.setMemberId(password);
		member.setPassword(repassword);
		member.setRegTime(new java.sql.Date(new java.util.Date().getTime()));
		String code=String.valueOf(System.currentTimeMillis());
		member.setA1(code);
		
		md.insertMember(member);
		System.out.println(member);
		
		MailUitls.sendMail(email,code);
		if(md.getMmberByCode(code)!=null){
			return "registersuccess";
		}else{
			
//			System.out.println(md.getMember("model.getPhone()"));
			return "error";
		}
		
		
	}
	
	public String active(){
		MemberDao md=new MemberDaoImpl();
		Member member=new Member();
		String code=ServletActionContext.getRequest().getParameter("code");
		System.out.println(code);
		
		member=md.getMmberByCode(code);
		System.out.println(member);
        boolean flag =md.isActive(member.getPhone());
        if(flag){
        	
        	return "active";
        }else{
        	
        	return "error";
        }
	}
	public void processcharset() throws UnsupportedEncodingException {
		if (!model.getMemberId().isEmpty())
			model.setMemberId(new String(model.getMemberId().getBytes(
					"iso-8859-1"), "UTF-8"));
		if (!model.getPassword().isEmpty())
			model.setPassword(new String(model.getPassword().getBytes(
					"iso-8859-1"), "UTF-8"));

	}
	
	public String getValidate_code() {
		return validate_code;
	}

	public void setValidate_code(String validate_code) {
		this.validate_code = validate_code;
	}

	@Override
	public Member getModel() {
		// TODO Auto-generated method stub
		return model;
	}

}
