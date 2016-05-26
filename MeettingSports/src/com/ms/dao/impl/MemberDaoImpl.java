package com.ms.dao.impl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ms.common.BaseDaoImpl;
import com.ms.dao.MemberDao;
import com.ms.model.Member;

public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {

	/**
	 * 查找用户的实现
	 */
	//通过用户名获取用户对象
	public Member getMember(String PhoneOrMemberName) {
		String sql = null;
		String regex = "1([\\d]{10})|((\\+[0-9]{2,4})?\\(?[0-9]+\\)?-?)?[0-9]{7,8}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(PhoneOrMemberName);
		if (m.find()) {
			sql = "SELECT*FROM member WHERE phone=?";
		} else {
			sql = "SELECT*FROM member WHERE memberId=?";
		}
		return query(sql, PhoneOrMemberName);
	}
	//获取全部用户对象
	@Override
	public List<Member> getAllMember() {
		// TODO Auto-generated method stub
		String sql="select*from member";
		return  queryForList(sql);
	}
	//获取全部商家用户
	@Override
	public List<Member> getAllSeller() {
		// TODO Auto-generated method stub
		String sql="select*from member where roleType=?;";
		return queryForList(sql,"1");
	}
	@Override
	public void updataMemberInfo(Member member) {
		// TODO Auto-generated method stub
		String sql="update member set memberId="+member.getMemberId()+",realname="
				+member.getRealName()+",birth="+member.getBirth()+",email="
				+member.getEmail()+",address="+member.getAddress()+",sex="
				+member.getSex()+",memberUrl="+member.getMemberUrl()+",introduces="
				+member.getIntroduces()+",habits="+member.getHabits()+",a1="+member.getA1();
		update(sql);
	}
	/**
	 * 更改userName的密码为password
	 * @param userName
	 * @param password
	 */
	public void updateMemberrPassword(String phone, String password) {
		// TODO Auto-generated method stub
		
		String sql="UPDATE member SET password=? WHERE phone=?;";
		update(sql, password,phone);
	}

	@Override
	public String insertMember(Member member) {
		String sql=" insert into member(memberId,password,phone,email,regTime,a1) value(?,?,?,?,?);";
		String id=insert(sql, member.getMemberId(),member.getPassword(),member.getPhone(),
				member.getEmail(),member.getRegTime(),member.getA1());
		return id;
	}
	//分页查询
	@Override
	public List<Member> getSeller() {
		// TODO Auto-generated method stub
		String sql=" select *from member where roleType='1' limit 10";
		return queryForList(sql);
	}
	@Override
	public List<Member> searchSeller(String keyword) {
		// TODO Auto-generated method stub
		String sql="select*from user  like ?";
		return queryForList(sql,keyword+"%");
	}
	@Override
	public Member getMmberByCode(String code) {

		String sql="select*from member where a1=?";
		return query(sql,code);
	}
	@Override
	public boolean isActive(String phone){
		String sql="UPDATE member SET a1=null WHERE phone=?";
		update(sql,phone);		
		return true;
	}
}
