package com.stephen.core.mapper;

import java.util.List;

import com.stephen.core.model.UserAttr;

public interface UserAttrMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user_attr
	 * @mbggenerated  Thu Feb 16 11:01:46 CST 2017
	 */
	int insert(UserAttr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user_attr
	 * @mbggenerated  Thu Feb 16 11:01:46 CST 2017
	 */
	int insertSelective(UserAttr record);

	List<UserAttr> getUserAttrs(Integer id);

	void deleteById(Integer id);

	void update(UserAttr attr);
}