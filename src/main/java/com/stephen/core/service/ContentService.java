package com.stephen.core.service;

import com.stephen.core.model.Content;

public interface ContentService {
	Content getContent(Integer id);

	Content deleteContet(Integer id);

	Content save(Content bean);
}
