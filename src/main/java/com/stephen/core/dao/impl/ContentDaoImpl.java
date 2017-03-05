package com.stephen.core.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stephen.core.dao.ChannelDao;
import com.stephen.core.dao.ContentDao;
import com.stephen.core.mapper.ContentAttrMapper;
import com.stephen.core.mapper.ContentExtMapper;
import com.stephen.core.mapper.ContentMapper;
import com.stephen.core.model.Content;
import com.stephen.core.model.ContentAttr;

@Repository
public class ContentDaoImpl implements ContentDao {

	@Override
	public int countByChannelId(int channelId) {
		return 0;
	}

	@Override
	public Content findById(Integer id) {
		Content content = contentMapper.selectByPrimaryKey(id);
		content.setChannel(channelDao.findById(content.getChannelId()));
		return content;
	}

	@Override
	@Transactional
	public Content save(Content bean) {
		contentMapper.insert(bean);
		for (ContentAttr attr : bean.getContentAttr()) {
			attr.setContentId(bean.getChannelId());
			contentAttrMapper.insert(attr);
		}
		return bean;
	}

	@Override
	@Transactional
	public Content deleteById(Integer id) {
		Content content = contentMapper.selectByPrimaryKey(id);
		contentAttrMapper.deleteById(id);
		contentExtMapper.deleteByPrimaryKey(id);
		contentMapper.deleteByPrimaryKey(id);
		return content;
	}

	@Autowired
	private ContentMapper contentMapper;
	@Autowired
	private ContentExtMapper contentExtMapper;
	@Autowired
	private ContentAttrMapper contentAttrMapper;
	@Autowired
	private ChannelDao channelDao;
}
