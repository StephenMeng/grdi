package com.stephen.core.mapper;

import com.stephen.core.model.ChannelExt;

public interface ChannelExtMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_channel_ext
	 * @mbggenerated  Wed Feb 15 22:50:05 CST 2017
	 */
	int deleteByPrimaryKey(Integer channelId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_channel_ext
	 * @mbggenerated  Wed Feb 15 22:50:05 CST 2017
	 */
	int insert(ChannelExt record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_channel_ext
	 * @mbggenerated  Wed Feb 15 22:50:05 CST 2017
	 */
	int insertSelective(ChannelExt record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_channel_ext
	 * @mbggenerated  Wed Feb 15 22:50:05 CST 2017
	 */
	ChannelExt selectByPrimaryKey(Integer channelId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_channel_ext
	 * @mbggenerated  Wed Feb 15 22:50:05 CST 2017
	 */
	int updateByPrimaryKeySelective(ChannelExt record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_channel_ext
	 * @mbggenerated  Wed Feb 15 22:50:05 CST 2017
	 */
	int updateByPrimaryKey(ChannelExt record);
}