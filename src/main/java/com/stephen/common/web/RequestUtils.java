package com.stephen.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.util.UrlPathHelper;

import com.stephen.core.model.User;
import com.stephen.core.page.Paginable;
import com.stephen.core.page.Pagination;

public class RequestUtils {
	public static String getLocation(HttpServletRequest request) {
		UrlPathHelper helper = new UrlPathHelper();
		StringBuffer buff = request.getRequestURL();
		String uri = request.getRequestURI();
		String origUri = helper.getOriginatingRequestUri(request);
		buff.replace(buff.length() - uri.length(), buff.length(), origUri);
		String queryString = helper.getOriginatingQueryString(request);
		if (queryString != null) {
			buff.append("?").append(queryString);
		}
		return buff.toString();
	}

	public static User getUser(HttpSession session) {
		// TODO Auto-generated method stub
		return (User) session.getAttribute(Constants.USER_INFO);
	}

	public static Pagination getPagenation(HttpServletRequest request) {
		Pagination pagination = new Pagination();
		String pageNo = request.getParameter("page");
		String pageSize = request.getParameter("pageSize");
		try {
			pagination.setPageNo(Integer.parseInt(pageNo));
		} catch (Exception e) {
		}
		try {
			pagination.setPageSize(Integer.parseInt(pageSize));
		} catch (Exception e) {
			System.out.println("pageSize is default!!");
		}
		return pagination;
	}
}
