package com.ms.dao;

import java.util.List;

import com.ms.model.Role;

public interface RoleDao {
	public abstract Role getuserRole(String userId);

	public abstract List<Role> getRole(String userId);

}
