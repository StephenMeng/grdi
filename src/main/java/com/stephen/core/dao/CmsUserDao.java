package com.stephen.core.dao;

import java.util.List;

import com.stephen.core.model.CmsUser;
import com.stephen.core.page.SimplePage;


/**
 * 用户DAO接口
 */
public interface CmsUserDao{
	public SimplePage getPage(String username, String email, Integer siteId,
			Integer groupId, Boolean disabled, Boolean admin, Integer rank,
			int pageNo, int pageSize);
	
	public List<CmsUser> getList(String username, String email, Integer siteId,
			Integer groupId, Boolean disabled, Boolean admin, Integer rank);

	public List<CmsUser> getAdminList(Integer siteId, Boolean allChannel,
			Boolean disabled, Integer rank);
	
	public SimplePage getAdminsByDepartId(Integer id, int pageNo,int pageSize);
	
	public SimplePage getAdminsByRoleId(Integer roleId, int pageNo, int pageSize);

	public CmsUser findById(Integer id);

	public CmsUser findByUsername(String username);

	public int countByUsername(String username);
	
	public int countMemberByUsername(String username);

	public int countByEmail(String email);

	public int save(CmsUser bean);

//	public CmsUser updateByUpdater(Updater<CmsUser> updater);

	public int deleteById(Integer id);
}