package com.stephen.core.dao;

import com.stephen.core.model.UserExt;

public interface UserExtDao {
	public int countByChannelId(int channelId);

	public UserExt findById(Integer id);

	public UserExt save(UserExt bean);

//	public UserExt updateByUpdater(Updater<UserExt> updater);

	public UserExt deleteById(Integer id);
}
