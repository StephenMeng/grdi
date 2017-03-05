package com.stephen.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.stephen.core.model.Channel;
import com.stephen.core.model.Content;

public interface ContentMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table s_content
	 *
	 * @mbggenerated Tue Jan 10 20:04:17 CST 2017
	 */
	int deleteByPrimaryKey(Integer contentId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table s_content
	 *
	 * @mbggenerated Tue Jan 10 20:04:17 CST 2017
	 */
	int insert(Content record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table s_content
	 *
	 * @mbggenerated Tue Jan 10 20:04:17 CST 2017
	 */
	int insertSelective(Content record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table s_content
	 *
	 * @mbggenerated Tue Jan 10 20:04:17 CST 2017
	 */
	Content selectByPrimaryKey(Integer contentId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table s_content
	 *
	 * @mbggenerated Tue Jan 10 20:04:17 CST 2017
	 */
	int updateByPrimaryKeySelective(Content record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table s_content
	 *
	 * @mbggenerated Tue Jan 10 20:04:17 CST 2017
	 */
	int updateByPrimaryKey(Content record);

	List<Content> findByChannelId(@Param("channelId")Integer channelId, @Param("start")int start, @Param("pageSize")int pageSize);

//	Channel selectChannel(Integer contentId);
}