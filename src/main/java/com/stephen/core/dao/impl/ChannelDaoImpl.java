package com.stephen.core.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stephen.core.dao.ChannelDao;
import com.stephen.core.mapper.ChannelAttrMapper;
import com.stephen.core.mapper.ChannelExtMapper;
import com.stephen.core.mapper.ChannelMapper;
import com.stephen.core.mapper.ContentMapper;
import com.stephen.core.model.Channel;
import com.stephen.core.model.ChannelAttr;
import com.stephen.core.model.Content;
import com.stephen.core.page.Paginable;
import com.stephen.core.page.Pagination;

@Repository
public class ChannelDaoImpl implements ChannelDao {

	@Override
	public int countByChannelId(int channelId) {
		return 0;
	}

	@Override
	public Channel findById(Integer id) {
		// TODO Auto-generated method stub
		Channel channel = channelMapper.selectByPrimaryKey(id);
		setParentInfo(channel);
		channel.setChild(channelMapper.selectChild(channel.getChannelId()));
		return channel;
	}

	@Override
	public Channel findByPathForTag(String path) {
		// TODO Auto-generated method stub
		Channel channel = channelMapper.findByPathForTag(path);
		setParentInfo(channel);
		channel.setChild(channelMapper.selectChild(channel.getChannelId()));
		return channel;
	}

	private void setParentInfo(Channel channel) {
		if (channel.getParentId() != 0) {
			Channel parent = channelMapper.selectByPrimaryKey(channel.getParentId());
			channel.setParent(parent);
			setParentInfo(parent);
		}
	}

	@Override
	public Pagination findByChannelId(Integer channelId, Paginable paginable) {
		// TODO Auto-generated method stub
		Pagination pagination = new Pagination();
		// channelMapper.selectByChannelId
		List<Content> contents = contentMapper.findByChannelId(channelId,
				(paginable.getCurrentPage() - 1) * paginable.getPageSize(), paginable.getPageSize());
		pagination.setList(contents);
		return pagination;
	}

	@Override
	@Transactional
	public Channel save(Channel bean) {
		channelMapper.insert(bean);
		int i = channelMapper.selectLastId();
		for (ChannelAttr attr : bean.getChannelAttr()) {
			attr.setChannelId(i);
			channelAttrMapper.insert(attr);
		}
		return bean;
	}

	@Override
	@Transactional
	public Channel deleteById(Integer id) {
		Channel Channel = channelMapper.selectByPrimaryKey(id);
		channelAttrMapper.deleteByChannelId(id);
		channelExtMapper.deleteByPrimaryKey(id);
		channelMapper.deleteByPrimaryKey(id);
		return Channel;
	}

	@Override
	public List<Channel> getChannels(int count) {
		// TODO Auto-generated method stub
		List<Channel> channels = new ArrayList<>();
		channels = channelMapper.selectPart(count);
		return channels;
	}

	@Override
	public List<Channel> getChannels() {
		// TODO Auto-generated method stub
		List<Channel> channels = new ArrayList<>();
		channels = channelMapper.selectAll();
		return channels;
	}

	@Override
	public List<Channel> getChildChannels(Channel channel) {
		List<Channel> channels = new ArrayList<>();
		List<Channel> ids = channelMapper.selectByParentId(channel.getChannelId());
		for (Channel id : ids) {
			channels.add(channelMapper.selectByPrimaryKey(id.getChannelId()));
		}
		return channels;
	}

	@Autowired
	private ChannelMapper channelMapper;
	@Autowired
	private ChannelExtMapper channelExtMapper;
	@Autowired
	private ChannelAttrMapper channelAttrMapper;
	@Autowired
	private ContentMapper contentMapper;

}
