package com.stephen.core.mapper;

import com.stephen.core.model.ContentTxt;

public interface ContentTxtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_txt
     *
     * @mbggenerated Tue Jan 10 20:07:11 CST 2017
     */
    int deleteByPrimaryKey(Integer contentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_txt
     *
     * @mbggenerated Tue Jan 10 20:07:11 CST 2017
     */
    int insert(ContentTxt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_txt
     *
     * @mbggenerated Tue Jan 10 20:07:11 CST 2017
     */
    int insertSelective(ContentTxt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_txt
     *
     * @mbggenerated Tue Jan 10 20:07:11 CST 2017
     */
    ContentTxt selectByPrimaryKey(Integer contentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_txt
     *
     * @mbggenerated Tue Jan 10 20:07:11 CST 2017
     */
    int updateByPrimaryKeySelective(ContentTxt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_content_txt
     *
     * @mbggenerated Tue Jan 10 20:07:11 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(ContentTxt record);
}