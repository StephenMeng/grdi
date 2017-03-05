package com.stephen.core.dao;

import com.stephen.core.model.ContentExt;

public interface ContentExtDao {
	public int countByChannelId(int channelId);

	public ContentExt findById(Integer id);

	public ContentExt save(ContentExt bean);

//	public ContentExt updateByUpdater(Updater<ContentExt> updater);

	public ContentExt deleteById(Integer id);
}
