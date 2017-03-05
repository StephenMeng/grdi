package com.stephen.common.web;

import javax.servlet.http.HttpServletRequest;

import com.stephen.core.model.CmsUser;

public class CmsUtils {
	public static final String USER_KEY = "_user_key";

	public static CmsUser getUser(HttpServletRequest request) {
		return (CmsUser) request.getAttribute(USER_KEY);
	}
}
