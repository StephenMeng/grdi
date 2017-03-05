package com.stephen.core.service;

import com.stephen.core.model.User;
import com.stephen.core.model.UserExt;
import com.stephen.core.page.Pagination;

public interface UserService {
	User getUser(int id);

	Pagination listUsers(Pagination page);

	Pagination listUsersByGroupId(int groupId, Pagination pagination);

	void saveUser(User user);

	void saveUserExt(UserExt ext);

	void deleteUser(int id);

	void updateUser(User user);
}
