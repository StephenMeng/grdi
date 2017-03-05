package com.stephen.core.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stephen.core.dao.CmsUserDao;
import com.stephen.core.mapper.CmsUserMapper;
import com.stephen.core.model.CmsUser;
import com.stephen.core.page.SimplePage;

@Repository
public class CmsUserDaoImpl implements CmsUserDao {

	@Override
	public SimplePage getPage(String username, String email, Integer siteId, Integer groupId, Boolean disabled,
			Boolean admin, Integer rank, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CmsUser> getList(String username, String email, Integer siteId, Integer groupId, Boolean disabled,
			Boolean admin, Integer rank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CmsUser> getAdminList(Integer siteId, Boolean allChannel, Boolean disabled, Integer rank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimplePage getAdminsByDepartId(Integer id, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimplePage getAdminsByRoleId(Integer roleId, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmsUser findById(Integer id) {
		// TODO Auto-generated method stub
		return cmsUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public CmsUser findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countByUsername(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countMemberByUsername(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countByEmail(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(CmsUser bean) {
		// TODO Auto-generated method stub
		System.out.println("save user");
		return cmsUserMapper.insert(bean);
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return cmsUserMapper.deleteByPrimaryKey(id);
	}

	@Autowired
	private CmsUserMapper cmsUserMapper;
}
