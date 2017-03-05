package com.stephen.core.dao;

import com.stephen.core.model.ContentChannelKey;

public interface ContentChannelDao {
	public int countByChannelId(int channelId);

	public ContentChannelKey findById(Integer id);

	public ContentChannelKey save(ContentChannelKey bean);

//	public ContentChannel updateByUpdater(Updater<ContentChannel> updater);

	public ContentChannelKey deleteById(Integer id);
}
