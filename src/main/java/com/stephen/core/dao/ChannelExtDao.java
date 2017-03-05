package com.stephen.core.dao;

import com.stephen.core.model.ChannelExt;

public interface ChannelExtDao {
	public int countByChannelId(int channelId);

	public ChannelExt findById(Integer id);

	public ChannelExt save(ChannelExt bean);

//	public ChannelExt updateByUpdater(Updater<ChannelExt> updater);

	public ChannelExt deleteById(Integer id);
	
}
