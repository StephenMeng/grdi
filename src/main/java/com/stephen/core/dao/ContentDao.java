package com.stephen.core.dao;

import java.util.List;

import com.stephen.core.model.Content;

public interface ContentDao {
	public int countByChannelId(int channelId);

	public Content findById(Integer id);

	public Content save(Content bean);

	// public Content updateByUpdater(Updater<Content> updater);

	public Content deleteById(Integer id);

}
