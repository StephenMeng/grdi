package com.stephen.core.dao;

import java.util.List;

import com.stephen.core.model.Navi;

public interface NaviDao {
	public int countByNaviId(int NaviId);

	public List<Navi> getNavis();

	public List<Navi> getChildNavis(Navi Navi);

	public Navi findById(Integer id);

	public Navi save(Navi bean);

	// public Navi updateByUpdater(Updater<Navi> updater);

	public Navi deleteById(Integer id);
}
