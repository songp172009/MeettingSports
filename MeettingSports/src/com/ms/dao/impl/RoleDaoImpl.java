package com.ms.dao.impl;

import java.util.List;

import com.ms.common.BaseDaoImpl;
import com.ms.dao.RoleDao;
import com.ms.model.Role;

public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao{

	@Override
	public List<Role> getRole(String userId) {
		
		String sql = "select * from member_role,role where member_role.roleId=role.roleId and member_role.memberId=?";
		List<Role> listRole = queryForList(sql, userId);
		return listRole;
	}

	@Override
	public Role getuserRole(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}


