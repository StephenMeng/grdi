package com.stephen.common.web;

import static com.stephen.common.web.Constants.RES_PATH;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;

import com.stephen.core.model.CmsUser;;

public class FrontUtils {
	public static final String TPL_SUFFIX = ".html";
	/**
	 * 椤甸潰娌℃湁鎵惧埌
	 */
	public static final String PAGE_NOT_FOUND = "pageNotFound";
	/**
	 * 鎿嶄綔鎴愬姛椤甸潰
	 */
	public static final String SUCCESS_PAGE = "tpl.successPage";
	/**
	 * 鎿嶄綔澶辫触椤甸潰
	 */
	public static final String ERROR_PAGE = "tpl.errorPage";
	/**
	 * 淇℃伅鎻愮ず椤甸潰
	 */
	public static final String MESSAGE_PAGE = "tpl.messagePage";
	/**
	 * 绯荤粺璧勬簮璺緞
	 */
	public static final String RES_SYS = "resSys";
	/**
	 * 妯℃澘璧勬簮璺緞
	 */
	public static final String RES_TPL = "res";
	/**
	 * 妯℃澘璧勬簮琛ㄨ揪寮�
	 */
	public static final String RES_EXP = "${res}";
	/**
	 * 閮ㄧ讲璺緞
	 */
	public static final String BASE = "base";
	/**
	 * 绔欑偣
	 */
	public static final String SITE = "site";
	/**
	 * 鐢ㄦ埛
	 */
	public static final String USER = "user";
	/**
	 * 椤电爜
	 */
	public static final String PAGE_NO = "pageNo";
	/**
	 * 鎬绘潯鏁�
	 */
	public static final String COUNT = "count";
	/**
	 * 璧峰鏉℃暟
	 */
	public static final String FIRST = "first";

	/**
	 * 椤甸潰瀹屾暣鍦板潃
	 */
	public static final String LOCATION = "location";
	/**
	 * 椤甸潰缈婚〉鍦板潃
	 */
	public static final String HREF = "href";
	/**
	 * href鍓嶅崐閮紙鐩稿浜庡垎椤碉級
	 */
	public static final String HREF_FORMER = "hrefFormer";
	/**
	 * href鍚庡崐閮紙鐩稿浜庡垎椤碉級
	 */
	public static final String HREF_LATTER = "hrefLatter";

	/**
	 * 浼犲叆鍙傛暟锛屽垪琛ㄦ牱寮忋��
	 */
	public static final String PARAM_STYLE_LIST = "styleList";
	/**
	 * 浼犲叆鍙傛暟锛岀郴缁熼瀹氫箟缈婚〉銆�
	 */
	public static final String PARAM_SYS_PAGE = "sysPage";
	/**
	 * 浼犲叆鍙傛暟锛岀敤鎴疯嚜瀹氫箟缈婚〉銆�
	 */
	public static final String PARAM_USER_PAGE = "userPage";

	/**
	 * 杩斿洖椤甸潰
	 */
	public static final String RETURN_URL = "returnUrl";

	public static final String ARGS = "args";
	public static final String START_TIME = "_start_time";
	private static final String TPLDIR_COMMON = "common";
	public static final String TPL_BASE = "/WEB-INF/t/cms/tpl/default";
	public static final String PROJ_NAME = "projname";

	/*
	 * 获取模板路径
	 */
	public static String getTplPath(HttpServletRequest request, String solution, String dir, String name) {
		// return solution + "/" + dir + "/" +
		// MessageResolver.getMessage(request, name) + TPL_SUFFIX;
		return solution + "/" + dir + "/" + name;
	}

	public static String getTplPath(String solution, String dir, String name) {
		return solution + "/" + dir + "/" + name + TPL_SUFFIX;
	}

	public static void frontData(HttpServletRequest request, ModelMap map) {
		CmsUser user = CmsUtils.getUser(request);
		String location = RequestUtils.getLocation(request);
		Long startTime = (Long) request.getAttribute(START_TIME);
		if (startTime != null) {
			map.put(START_TIME, startTime);
		}
		if (user != null) {
			map.put(USER, user);
		}
		map.put(PROJ_NAME, "/shangshi/");
		map.put(RES_SYS, RES_PATH);
		String res = RES_PATH + "/" + "tpl" + "/" + "default";
		map.put(RES_TPL, res.substring(1));
		map.put(LOCATION, location);
	}

	public static String pageNotFound(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		frontData(request, model);
		return getTplPath(request, TPL_BASE, TPLDIR_COMMON, PAGE_NOT_FOUND);
	}

}
