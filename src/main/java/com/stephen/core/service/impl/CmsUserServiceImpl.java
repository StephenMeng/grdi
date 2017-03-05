package com.stephen.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stephen.core.dao.CmsUserDao;
import com.stephen.core.model.CmsUser;
import com.stephen.core.page.Pagination;
import com.stephen.core.service.CmsUserService;

@Service
public class CmsUserServiceImpl implements CmsUserService {

	@Override
	public int register(CmsUser user) {
		// TODO Auto-generated method stub
		return cmsUserDao.save(user);
	}

	@Override
	public Pagination getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmsUser getUser(int id) {
		// TODO Auto-generated method stub
		return cmsUserDao.findById(id);
	}

	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return cmsUserDao.deleteById(id);
	}

	@Autowired
	private CmsUserDao cmsUserDao;
}
