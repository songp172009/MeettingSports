package Test;


import org.junit.Test;

import com.ms.dao.MemberDao;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Member;

public class TestUser {
//	@Test
//	public void findUser(){
//
//		MemberDao ud=new MemberDaoImpl();
//		Member user=ud.getMember("meimei");
//		System.out.println(user);
//		System.out.println(".........");
//
//	}
	//	@Test
	//	public void getAllSeller(){
	//		MemberDao ud=new MemberDaoImpl();
	//		List<Member> user=ud.getAllSeller();
	//		System.out.println("商家.........");
	//		System.out.println(user);
	//		System.out.println("商家.........");
	//	}
	//	@Test
	//	public void getAllMember(){
	//		MemberDao ud=new MemberDaoImpl();
	//		System.out.println("所有用户.........");
	//		List<Member> user=ud.getAllMember();
	//		System.out.println("所有用户.........");
	//		System.out.println(user);
	//	}
	//	@Test
	//	public void getSeller(){
	//		MemberDao ud=new MemberDaoImpl();
	//		System.out.println("所有用户.........");
	//		List<Member> user=ud.getSeller();
	//		System.out.println("所有用户.........");
	//		System.out.println(user);
	//	}

//	@Test
//	public void searchSeller(){
//
//		MemberDao ud=new MemberDaoImpl();
//		Member user=ud.getMember("meimei");
//		System.out.println(user);
//		System.out.println(".........");
//
//	}
//
//	@Test
//	public void updataMemberInfo(){
//
//		MemberDao ud=new MemberDaoImpl();
//		
//		Member user=ud.getMember("meimei");
//		System.out.println(user.getA1());
//		user.setA1("asas");
//		
//		ud.updataMemberInfo(user);
//		System.out.println(user.getA1());
//
//	}
//
//	@Test
//	public void updateMemberrPassword(){
//
//		MemberDao ud=new MemberDaoImpl();
//		ud.updateMemberrPassword("110110110", "123456");
//		System.out.println(".........");
//
//	}
//	@Test
//	public void insertMember(){
//
//		MemberDao ud=new MemberDaoImpl();
//		Member member=new Member();
//		member.setMemberId("nishishabi");
//		member.setPassword("111111");
//		member.setPhone("12345635463");
//		member.setRegTime(new java.sql.Date(new java.util.Date().getTime()));
//		String userid=ud.insertMember(member);
//		System.out.println(userid);
//		System.out.println(".........");
//
//	}
	@Test
	public void getUserByCode(){
		MemberDao md=new MemberDaoImpl();
		Member member=md.getMmberByCode("1232313213213");
		System.out.println(member);
		boolean flag =md.isActive(member.getPhone());
		System.out.println(member.getA1());
		System.out.println(flag);
	}
}
