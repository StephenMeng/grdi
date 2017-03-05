package com.stephen.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stephen.core.dao.UserDao;
import com.stephen.core.model.User;
import com.stephen.core.model.UserExt;
import com.stephen.core.page.Pagination;
import com.stephen.core.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public Pagination listUsers(Pagination page) {
		page.setList(userDao.selectAllUsers(page));
		page.setTotalCount(userDao.countUsers());
//		System.out.println("service:"+page.getCurrentPage());
		return page;

	}

	@Override
	public Pagination listUsersByGroupId(int groupId, Pagination pagination) {
		// TODO Auto-generated method stub
		pagination.setList(userDao.selectUserByGroupId(groupId, pagination));
		return pagination;
	}

	@Override
	public void saveUser(User user) {
		userDao.save(user);
	}

	@Autowired
	private UserDao userDao;

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public void saveUserExt(UserExt ext) {
		userDao.saveExt(ext);
	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteById(id);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

}
