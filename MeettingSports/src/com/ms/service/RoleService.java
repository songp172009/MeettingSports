package com.ms.service;

import java.util.List;

import com.ms.model.Role;

public interface RoleService {

	List<Role> findAllRoleType(String userId);
	
	Role findRoleType(String userId);
	
	
}
