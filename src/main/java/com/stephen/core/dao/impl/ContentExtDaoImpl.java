package com.stephen.core.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stephen.core.dao.ContentExtDao;
import com.stephen.core.mapper.ContentExtMapper;
import com.stephen.core.model.ContentExt;

@Repository
public class ContentExtDaoImpl implements ContentExtDao{

	@Override
	public int countByChannelId(int channelId) {
		return 0;
	}

	@Override
	public ContentExt findById(Integer id) {
		// TODO Auto-generated method stub
		return ContentExtMapper.selectByPrimaryKey(id);
	}

	@Override
	public ContentExt save(ContentExt bean) {
		 ContentExtMapper.insert(bean);
		 return bean;
	}

	@Override
	public ContentExt deleteById(Integer id) {
		ContentExt ContentExt=ContentExtMapper.selectByPrimaryKey(id);
		ContentExtMapper.deleteByPrimaryKey(id);
		return ContentExt;
	}
@Autowired
private ContentExtMapper ContentExtMapper;
}
