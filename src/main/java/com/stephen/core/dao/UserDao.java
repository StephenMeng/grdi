package com.stephen.core.dao;

import java.util.List;

import com.stephen.core.model.User;
import com.stephen.core.model.UserExt;
import com.stephen.core.page.Pagination;

public interface UserDao {
	public int countByChannelId(int channelId);

	public User findById(Integer id);

	public User save(User bean);

	public User deleteById(Integer id);

	public void saveExt(UserExt ext);

	public List<User> selectUserByGroupId(Integer groupId, Pagination page);

	public List<User> selectAllUsers(Pagination page);

	public void updateUser(User user);

	public int countUsers();

}
