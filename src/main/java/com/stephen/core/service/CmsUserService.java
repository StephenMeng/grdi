package com.stephen.core.service;

import com.stephen.core.model.CmsUser;
import com.stephen.core.page.Pagination;

public interface CmsUserService {
	public int register(CmsUser user);

	public Pagination getUsers();

	public CmsUser getUser(int id);

	public int deleteUser(int id);
}
