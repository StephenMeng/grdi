package com.stephen.core.mapper;

import com.stephen.core.model.Model;

public interface ModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model
     *
     * @mbggenerated Wed Jan 11 10:02:17 CST 2017
     */
    int deleteByPrimaryKey(Integer modelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model
     *
     * @mbggenerated Wed Jan 11 10:02:17 CST 2017
     */
    int insert(Model record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model
     *
     * @mbggenerated Wed Jan 11 10:02:17 CST 2017
     */
    int insertSelective(Model record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model
     *
     * @mbggenerated Wed Jan 11 10:02:17 CST 2017
     */
    Model selectByPrimaryKey(Integer modelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model
     *
     * @mbggenerated Wed Jan 11 10:02:17 CST 2017
     */
    int updateByPrimaryKeySelective(Model record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model
     *
     * @mbggenerated Wed Jan 11 10:02:17 CST 2017
     */
    int updateByPrimaryKey(Model record);
}