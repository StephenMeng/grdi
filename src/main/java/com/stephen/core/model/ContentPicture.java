package com.stephen.core.model;

public class ContentPicture extends ContentPictureKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_content_picture.img_path
     *
     * @mbggenerated Tue Jan 10 20:06:39 CST 2017
     */
    private String imgPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_content_picture.description
     *
     * @mbggenerated Tue Jan 10 20:06:39 CST 2017
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_content_picture.img_path
     *
     * @return the value of s_content_picture.img_path
     *
     * @mbggenerated Tue Jan 10 20:06:39 CST 2017
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_content_picture.img_path
     *
     * @param imgPath the value for s_content_picture.img_path
     *
     * @mbggenerated Tue Jan 10 20:06:39 CST 2017
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_content_picture.description
     *
     * @return the value of s_content_picture.description
     *
     * @mbggenerated Tue Jan 10 20:06:39 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_content_picture.description
     *
     * @param description the value for s_content_picture.description
     *
     * @mbggenerated Tue Jan 10 20:06:39 CST 2017
     */
    public void setDescription(String description) {
        this.description = description;
    }
}