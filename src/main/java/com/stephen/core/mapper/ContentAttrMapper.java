package com.stephen.core.mapper;

import com.stephen.core.model.ContentAttr;

public interface ContentAttrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_attr
     *
     * @mbggenerated Tue Jan 10 20:04:55 CST 2017
     */
    int insert(ContentAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_attr
     *
     * @mbggenerated Tue Jan 10 20:04:55 CST 2017
     */
    int insertSelective(ContentAttr record);

	void deleteById(Integer id);
}