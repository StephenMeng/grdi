package com.stephen.core.service;

import java.util.List;

import com.stephen.core.model.Channel;
import com.stephen.core.page.Paginable;
import com.stephen.core.page.Pagination;

public interface ChannelService {
	Channel findByPathForTag(String path);
	
	Pagination findByChannelId(int channelId,Paginable p);

}
