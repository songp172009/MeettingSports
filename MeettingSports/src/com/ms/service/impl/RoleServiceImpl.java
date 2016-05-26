package com.ms.service.impl;

import java.util.List;

import com.ms.dao.RoleDao;
import com.ms.dao.impl.RoleDaoImpl;
import com.ms.model.Role;
import com.ms.service.RoleService;

public class RoleServiceImpl implements RoleService{

	@Override
	public List<Role> findAllRoleType(String memberId) {
		RoleDao rd=new RoleDaoImpl();
		List<Role> listRole=null;
		listRole=rd.getRole(memberId);
		return listRole;
	}
	
	@Override
	public Role findRoleType(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
