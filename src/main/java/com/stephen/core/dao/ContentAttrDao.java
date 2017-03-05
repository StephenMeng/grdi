package com.stephen.core.dao;

import java.util.List;

import com.stephen.core.model.ContentAttr;

public interface ContentAttrDao {
	public int countByContentAttrId(int ContentAttrId);

	public List<ContentAttr> getContentAttrs(int count);

	public List<ContentAttr> getContentAttrs();

	public List<ContentAttr> getChildContentAttrs(ContentAttr ContentAttr);

	public ContentAttr findById(Integer id);

	public ContentAttr save(ContentAttr bean);

	// public ContentAttr updateByUpdater(Updater<ContentAttr> updater);

	public ContentAttr deleteById(Integer id);
}
