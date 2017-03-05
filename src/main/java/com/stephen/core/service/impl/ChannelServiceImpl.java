package com.stephen.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stephen.core.dao.ChannelDao;
import com.stephen.core.dao.ChannelExtDao;
import com.stephen.core.model.Channel;
import com.stephen.core.model.ChannelExt;
import com.stephen.core.page.Paginable;
import com.stephen.core.page.Pagination;
import com.stephen.core.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService {

	@Autowired
	private ChannelDao ChannelDao;

	@Override
	public Channel findByPathForTag(String path) {
		// TODO Auto-generated method stub
		return ChannelDao.findByPathForTag(path);
	}

	@Override
	public Pagination findByChannelId(int channelId, Paginable p) {
		// TODO Auto-generated method stub
		return ChannelDao.findByChannelId(channelId, p);
	}
}
