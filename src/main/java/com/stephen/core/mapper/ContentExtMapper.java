package com.stephen.core.mapper;

import com.stephen.core.model.ContentExt;

public interface ContentExtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_ext
     *
     * @mbggenerated Tue Jan 10 20:05:45 CST 2017
     */
    int deleteByPrimaryKey(Integer contentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_ext
     *
     * @mbggenerated Tue Jan 10 20:05:45 CST 2017
     */
    int insert(ContentExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_ext
     *
     * @mbggenerated Tue Jan 10 20:05:45 CST 2017
     */
    int insertSelective(ContentExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_ext
     *
     * @mbggenerated Tue Jan 10 20:05:45 CST 2017
     */
    ContentExt selectByPrimaryKey(Integer contentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_ext
     *
     * @mbggenerated Tue Jan 10 20:05:45 CST 2017
     */
    int updateByPrimaryKeySelective(ContentExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_ext
     *
     * @mbggenerated Tue Jan 10 20:05:45 CST 2017
     */
    int updateByPrimaryKey(ContentExt record);
}