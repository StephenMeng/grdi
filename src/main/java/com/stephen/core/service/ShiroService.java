package com.stephen.core.service;

import java.util.Set;

import com.stephen.core.model.CmsUser;
import com.stephen.core.model.Permission;
import com.stephen.core.model.Role;
import com.stephen.core.model.User;

public interface ShiroService {
	public CmsUser getCmsUserByUserId(int userid);

	public User getUserByUserId(int userid);

	public Set<Role> getRoles(String userid);

	public Set<Permission> getPermissions(int roleid);
}
