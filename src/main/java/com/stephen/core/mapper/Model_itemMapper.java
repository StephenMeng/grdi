package com.stephen.core.mapper;

import com.stephen.core.model.Model_item;

public interface Model_itemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model_item
     *
     * @mbggenerated Wed Jan 11 10:02:31 CST 2017
     */
    int deleteByPrimaryKey(Integer modelitemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model_item
     *
     * @mbggenerated Wed Jan 11 10:02:31 CST 2017
     */
    int insert(Model_item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model_item
     *
     * @mbggenerated Wed Jan 11 10:02:31 CST 2017
     */
    int insertSelective(Model_item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model_item
     *
     * @mbggenerated Wed Jan 11 10:02:31 CST 2017
     */
    Model_item selectByPrimaryKey(Integer modelitemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model_item
     *
     * @mbggenerated Wed Jan 11 10:02:31 CST 2017
     */
    int updateByPrimaryKeySelective(Model_item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_model_item
     *
     * @mbggenerated Wed Jan 11 10:02:31 CST 2017
     */
    int updateByPrimaryKey(Model_item record);
}