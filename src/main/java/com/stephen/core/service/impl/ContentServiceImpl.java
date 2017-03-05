package com.stephen.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stephen.core.dao.ContentDao;
import com.stephen.core.dao.ContentExtDao;
import com.stephen.core.model.Content;
import com.stephen.core.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Override
	public Content getContent(Integer id) {
		// TODO Auto-generated method stub
		return contentDao.findById(id);
	}

	@Override
	public Content deleteContet(Integer id) {
		// TODO Auto-generated method stub
		return contentDao.deleteById(id);
	}

	@Override
	public Content save(Content bean) {
		// TODO Auto-generated method stub
		return contentDao.save(bean);
	}

	@Autowired
	private ContentDao contentDao;
	@Autowired
	private ContentExtDao contentExtDao;
}
