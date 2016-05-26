package com.ms.dao;

import java.util.List;

import com.ms.common.BaseDao;
import com.ms.model.Member;

/**
 * 用户数据访问接口
 * 
 * @author jiachao
 * 
 */
public interface MemberDao extends BaseDao<Member>{
	//获取全部商家用户
	public abstract List<Member> getAllSeller();
	//获取全部用户对象
	public abstract List<Member> getAllMember();
	//通过用户名或手机获取用户对象
	public abstract Member getMember(String PhoneOrMemberName);
	//分页查询
	public abstract List<Member> getSeller();
	//搜索
	public abstract List<Member> searchSeller(String keyword);
	//更新会员用户数据
	public abstract void updataMemberInfo(Member member);
	//根据手机修改会员用户密码
	public abstract void updateMemberrPassword(String phone,String password);
	//注册
	public abstract String insertMember(Member member);
	//根据激活码获取用户
	public abstract Member getMmberByCode(String code);
	//设置用户激活状态
	public abstract boolean isActive(String phone);
}