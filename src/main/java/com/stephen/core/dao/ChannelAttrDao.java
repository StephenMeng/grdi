package com.stephen.core.dao;

import com.stephen.core.model.ChannelAttr;

public interface ChannelAttrDao {
	public int countByChannelId(int channelId);

	public ChannelAttr findById(Integer id);

	public ChannelAttr save(ChannelAttr bean);

//	public ChannelAttr updateByUpdater(Updater<ChannelAttr> updater);

	public ChannelAttr deleteById(Integer id);
}
