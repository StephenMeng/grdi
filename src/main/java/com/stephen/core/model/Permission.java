package com.stephen.core.model;

public class Permission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_permission.ID
     *
     * @mbggenerated Wed Jan 11 10:15:54 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_permission.PERMISSION_NAME
     *
     * @mbggenerated Wed Jan 11 10:15:54 CST 2017
     */
    private String permissionName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_permission.ID
     *
     * @return the value of s_permission.ID
     *
     * @mbggenerated Wed Jan 11 10:15:54 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_permission.ID
     *
     * @param id the value for s_permission.ID
     *
     * @mbggenerated Wed Jan 11 10:15:54 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_permission.PERMISSION_NAME
     *
     * @return the value of s_permission.PERMISSION_NAME
     *
     * @mbggenerated Wed Jan 11 10:15:54 CST 2017
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_permission.PERMISSION_NAME
     *
     * @param permissionName the value for s_permission.PERMISSION_NAME
     *
     * @mbggenerated Wed Jan 11 10:15:54 CST 2017
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}