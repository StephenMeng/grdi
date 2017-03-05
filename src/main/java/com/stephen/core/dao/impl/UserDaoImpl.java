package com.stephen.core.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stephen.core.dao.UserDao;
import com.stephen.core.mapper.UserAttrMapper;
import com.stephen.core.mapper.UserExtMapper;
import com.stephen.core.mapper.UserMapper;
import com.stephen.core.model.User;
import com.stephen.core.model.UserAttr;
import com.stephen.core.model.UserExt;
import com.stephen.core.page.Pagination;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public int countByChannelId(int channelId) {
		return 0;
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public User save(User bean) {
		try {
			userMapper.insert(bean);
//			int id = userMapper.selectLastId();
			UserExt ext = bean.getUserExt();
			ext.setUserId(bean.getUserId());
			userExtMapper.insert(ext);
			for (UserAttr attr : bean.getUserAttr()) {
				attr.setUserId(bean.getUserId());
				userAttrMapper.insert(attr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Override
	@Transactional
	public User deleteById(Integer id) {
		User User = userMapper.selectByPrimaryKey(id);
		userAttrMapper.deleteById(id);
		userExtMapper.deleteByPrimaryKey(id);
		userMapper.deleteByPrimaryKey(id);
		return User;
	}

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserExtMapper userExtMapper;
	@Autowired
	private UserAttrMapper userAttrMapper;

	@Override
	public List<User> selectUserByGroupId(Integer groupId, Pagination page) {
		// TODO Auto-generated method stub
		List<User> users = userMapper.selectUsersByGroupId(groupId, (page.getCurrentPage() - 1) * page.getPageSize(),
				page.getPageSize());
		return users;
	}

	@Override
	public List<User> selectAllUsers(Pagination page) {
		// TODO Auto-generated method stub
		List<User> users = userMapper.selectAllUsers((page.getCurrentPage() - 1) * page.getPageSize(),
				page.getPageSize());
		return users;
	}

	@Override
	public void saveExt(UserExt ext) {
		userExtMapper.insert(ext);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateByPrimaryKey(user);

		UserExt ext = user.getUserExt();
		ext.setUserId(user.getUserId());
		userExtMapper.updateByPrimaryKey(ext);

		for (UserAttr attr : user.getUserAttr()) {
			attr.setUserId(user.getUserId());
			userAttrMapper.update(attr);
		}
	}

	@Override
	public int countUsers() {
		// TODO Auto-generated method stub
		return userMapper.selectCount();
	}

}
