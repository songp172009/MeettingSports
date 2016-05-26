package com.ms.service.impl;

import java.util.List;

import com.ms.dao.MemberDao;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Role;
import com.ms.model.Member;
import com.ms.service.MemberService;

public class MemberServiceImpl extends MemberDaoImpl implements MemberService{
	
	

	@Override
	public void saveOrUpdateUser(Member user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delPerson(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member findPersonById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePersonInfo(Role role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePersonPW(String PW) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Member> findAllPersonInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> findPersonInfo(String qe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countPerson() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Member> browsePerson(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Member user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> PersonEExist(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean PersonExist(String hql) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean PersonExistPW(String pw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Object[]> queryByString(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePersonPW(String PW, String ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Member> findInfoByPage(String qe, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countByquery(String hql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Member> browseAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updata(String hql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member findPersonByPhoneOrMemberId(String PhoneOrMemberId) {
		MemberDao md=new MemberDaoImpl();
		return md.getMember(PhoneOrMemberId);
	}
	

}
