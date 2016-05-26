/**
 * 
 */
/**
 * @author jiachao
 *
 */
package com.ms.service;

import java.util.List;

import com.ms.model.Role;
import com.ms.model.Member;

public interface MemberService {

	/** 更新操作 */
	public void saveOrUpdateUser(Member user);

	/** 删除操作 */
	public void delPerson(Integer id);

	/** 查询单个用户 */
	public Member findPersonById(Integer id);

	/** 更新操作 */
	public boolean updatePersonInfo(Role role);

	public boolean updatePersonPW(String PW);

	public List<Member> findAllPersonInfo();

	public List<Member> findPersonInfo(String qe);

	public int countPerson();

	public List<Member> browsePerson(int pageNo, int pageSize);

	public String save(Member user);

	public List<Member> PersonEExist(String hql);

	public boolean PersonExist(String hql);

	public boolean PersonExistPW(String pw);

	public List<Object[]> queryByString(String hql);

	public boolean updatePersonPW(String PW, String ID);

	public List<Member> findInfoByPage(String qe, int pageNo, int pageSize);
	/** */
	public int countAll();
	/** */
	public int countByquery(String hql);

	public List<Member> browseAll(int pageNo, int pageSize);

	public Member findById(Integer id);

	public int updata(String hql);
	public Member findPersonByPhoneOrMemberId(String PhoneOrMemberId);

}