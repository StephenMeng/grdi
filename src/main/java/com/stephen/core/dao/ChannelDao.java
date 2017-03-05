package com.stephen.core.dao;

import java.util.List;

import com.stephen.core.model.Channel;
import com.stephen.core.page.Paginable;
import com.stephen.core.page.Pagination;

public interface ChannelDao {
	public int countByChannelId(int channelId);

	public List<Channel> getChannels(int count);

	public List<Channel> getChannels();

	public List<Channel> getChildChannels(Channel channel);

	public Channel findById(Integer id);

	public Channel save(Channel bean);

	// public Channel updateByUpdater(Updater<Channel> updater);

	public Channel deleteById(Integer id);

	public Channel findByPathForTag(String path);

	public Pagination findByChannelId(Integer channelId,Paginable paginable);
}
