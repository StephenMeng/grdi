package com.stephen.core.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stephen.core.dao.CmsUserDao;
import com.stephen.core.dao.UserDao;
import com.stephen.core.model.CmsUser;
import com.stephen.core.model.Permission;
import com.stephen.core.model.Role;
import com.stephen.core.model.User;
import com.stephen.core.service.ShiroService;

@Service
public class ShiroServiceImpl implements ShiroService {

	public CmsUser getCmsUserByUserId(int userid) {
		// TODO Auto-generated method stub
		return cmsUserDao.findById(userid);
	}

	public User getUserByUserId(int userid) {
		// TODO Auto-generated method stub
		return userDao.findById(userid);
	}

	public Set<Role> getRoles(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Permission> getPermissions(int roleid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	private CmsUserDao cmsUserDao;
	@Autowired
	private UserDao userDao;
}
