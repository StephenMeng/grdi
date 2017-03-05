package com.stephen.core.dao;

import com.stephen.core.model.UserAttr;

public interface UserAttrDao {
	public int countByChannelId(int channelId);

	public UserAttr findById(Integer id);

	public UserAttr save(UserAttr bean);

//	public UserAttr updateByUpdater(Updater<UserAttr> updater);

	public UserAttr deleteById(Integer id);
}
