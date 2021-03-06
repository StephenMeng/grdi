package com.stephen.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.user_id
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Integer userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.group_id
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Integer groupId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.username
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.email
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.register_time
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Date registerTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.register_ip
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private String registerIp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.last_login_time
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Date lastLoginTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.last_login_ip
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private String lastLoginIp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.login_count
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Integer loginCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.rank
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Integer rank;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.upload_total
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Long uploadTotal;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.upload_size
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Integer uploadSize;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.upload_date
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Date uploadDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.is_admin
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Boolean isAdmin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.is_self_admin
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Boolean isSelfAdmin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.is_disabled
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private Boolean isDisabled;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column s_user.password
	 * 
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	private String password;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.user_id
	 * 
	 * @return the value of s_user.user_id
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */

	public User() {
		// TODO Auto-generated constructor stub
		this.userExt = new UserExt();
		this.userAttr = new ArrayList<>();
	}

	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.user_id
	 * 
	 * @param userId
	 *            the value for s_user.user_id
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.group_id
	 * 
	 * @return the value of s_user.group_id
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Integer getGroupId() {
		return groupId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.group_id
	 * 
	 * @param groupId
	 *            the value for s_user.group_id
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.username
	 * 
	 * @return the value of s_user.username
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.username
	 * 
	 * @param username
	 *            the value for s_user.username
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.email
	 * 
	 * @return the value of s_user.email
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.email
	 * 
	 * @param email
	 *            the value for s_user.email
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.register_time
	 * 
	 * @return the value of s_user.register_time
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Date getRegisterTime() {
		return registerTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.register_time
	 * 
	 * @param registerTime
	 *            the value for s_user.register_time
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.register_ip
	 * 
	 * @return the value of s_user.register_ip
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public String getRegisterIp() {
		return registerIp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.register_ip
	 * 
	 * @param registerIp
	 *            the value for s_user.register_ip
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.last_login_time
	 * 
	 * @return the value of s_user.last_login_time
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.last_login_time
	 * 
	 * @param lastLoginTime
	 *            the value for s_user.last_login_time
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.last_login_ip
	 * 
	 * @return the value of s_user.last_login_ip
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.last_login_ip
	 * 
	 * @param lastLoginIp
	 *            the value for s_user.last_login_ip
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.login_count
	 * 
	 * @return the value of s_user.login_count
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Integer getLoginCount() {
		return loginCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.login_count
	 * 
	 * @param loginCount
	 *            the value for s_user.login_count
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.rank
	 * 
	 * @return the value of s_user.rank
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Integer getRank() {
		return rank;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.rank
	 * 
	 * @param rank
	 *            the value for s_user.rank
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.upload_total
	 * 
	 * @return the value of s_user.upload_total
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Long getUploadTotal() {
		return uploadTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.upload_total
	 * 
	 * @param uploadTotal
	 *            the value for s_user.upload_total
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setUploadTotal(Long uploadTotal) {
		this.uploadTotal = uploadTotal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.upload_size
	 * 
	 * @return the value of s_user.upload_size
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Integer getUploadSize() {
		return uploadSize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.upload_size
	 * 
	 * @param uploadSize
	 *            the value for s_user.upload_size
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setUploadSize(Integer uploadSize) {
		this.uploadSize = uploadSize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.upload_date
	 * 
	 * @return the value of s_user.upload_date
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Date getUploadDate() {
		return uploadDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.upload_date
	 * 
	 * @param uploadDate
	 *            the value for s_user.upload_date
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.is_admin
	 * 
	 * @return the value of s_user.is_admin
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Boolean getIsAdmin() {
		return isAdmin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.is_admin
	 * 
	 * @param isAdmin
	 *            the value for s_user.is_admin
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.is_self_admin
	 * 
	 * @return the value of s_user.is_self_admin
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Boolean getIsSelfAdmin() {
		return isSelfAdmin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.is_self_admin
	 * 
	 * @param isSelfAdmin
	 *            the value for s_user.is_self_admin
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setIsSelfAdmin(Boolean isSelfAdmin) {
		this.isSelfAdmin = isSelfAdmin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.is_disabled
	 * 
	 * @return the value of s_user.is_disabled
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public Boolean getIsDisabled() {
		return isDisabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.is_disabled
	 * 
	 * @param isDisabled
	 *            the value for s_user.is_disabled
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column s_user.password
	 * 
	 * @return the value of s_user.password
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column s_user.password
	 * 
	 * @param password
	 *            the value for s_user.password
	 * @mbggenerated Sat Feb 18 19:49:53 CST 2017
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	private Map<String, String> attr = new HashMap<>();

	public Map<String, String> getAttr() {
		if (attr.size() == 0) {
			for (UserAttr a : userAttr) {
				attr.put(a.getAttrName(), a.getAttrValue());
			}
		}
		return attr;
	}

	public void setAttr(Map<String, String> attr) {
		this.attr = attr;
	}

	private UserExt userExt;
	private List<UserAttr> userAttr;

	public List<UserAttr> getUserAttr() {
		return userAttr;
	}

	public void setUserAttr(List<UserAttr> userAttrs) {
		this.userAttr = userAttrs;
	}

	public UserExt getUserExt() {
		return userExt;
	}

	public void setUserExt(UserExt userExt) {
		this.userExt = userExt;
	}

	public String getTest() {
		return "stephen";
	}

	public String getGender() {
		return getUserExt().getGender() ? "male" : "famale";
	}

	public void setUserImg(String string) {
		getUserExt().setUserImg(string);
	}
}