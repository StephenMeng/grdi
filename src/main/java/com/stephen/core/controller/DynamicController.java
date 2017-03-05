package com.stephen.core.controller;

import static com.stephen.common.web.Constants.TPLDIR_CONTENT;
import static com.stephen.common.web.Constants.TPL_BASE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UrlPathHelper;

import com.stephen.common.web.FrontUtils;
import com.stephen.common.web.URLHelper;
import com.stephen.core.model.Channel;
import com.stephen.core.model.Content;
import com.stephen.core.model.User;
import com.stephen.core.page.Pagination;
import com.stephen.core.page.SimplePage;
import com.stephen.core.service.ChannelService;
import com.stephen.core.service.ContentService;
import com.stephen.core.service.UserService;;

@Controller
public class DynamicController {
	private static final String TPLDIR_CHANNEL = "/channel";

	private static List<String> userPaths = new ArrayList<>(Arrays.asList("cyjs", "js", "fjs", "bs", "ss", "xs"));

	/**
	 * TOMCAT的默认路径
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		FrontUtils.frontData(request, model);
		// 带有其他路径则是非法请求
		String uri = URLHelper.getURI(request);
		if (StringUtils.isNotBlank(uri) && !uri.equals("/")) {
			return FrontUtils.pageNotFound(request, response, model);
		}
		// 使用静态首页而且静态首页存在
		return FrontUtils.TPL_BASE + "/index";
	}

	/**
	 * WEBLOGIC的默认路径
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
	public String indexForWeblogic(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		System.out.println("首页定向");
		return index(request, response, model);
	}

	/**
	 * 动态页入口
	 */
	@RequestMapping(value = "/*/index.html")
	public String dynamic(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		FrontUtils.frontData(request, model);

		String[] paths = URLHelper.getPaths(request);
		int len = paths.length;
		if (len == 1) {
			// 单页
			return channel(paths[0], true, request, response, model);
		} else if (userPaths.contains(paths[0])) {
			return userContent(0, paths[0], request, response, model);
		} else {
			return channel(paths[0], false, request, response, model);
		}
	}

	public String channel(String path, boolean checkAlone, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		Channel channel = channelService.findByPathForTag(path);
		if (channel == null) {
			return FrontUtils.pageNotFound(request, response, model);
		}
		Pagination pagination = channelService.findByChannelId(channel.getChannelId(), new SimplePage(1, 6, 30));
		if (checkAlone) {
			if (channel.getHasContent()) {
				return FrontUtils.pageNotFound(request, response, model);
			}
		}

		Channel leftChannel = getLeftChannel(channel);

		model.addAttribute("channel", channel);
		model.addAttribute("leftChannel", leftChannel);

		model.addAttribute("page", pagination);
		return TPL_BASE + TPLDIR_CHANNEL + "/" + "zxdt";
	}

	private Channel getLeftChannel(Channel channel) {
		Channel leftChannel = channel;
		System.out.println("priority:" + channel.getPriority());
		if (channel.getPriority() == 3) {
			leftChannel = channelService.findByPathForTag(channel.getParent().getChannelPath());
		}
		return leftChannel;
	}

	@RequestMapping(value = "/*/{id}.html")
	public String dynamicContent(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@PathVariable Integer id) {
		FrontUtils.frontData(request, model);
		UrlPathHelper helper = new UrlPathHelper();
		String[] paths = URLHelper.getPaths(request);
		if (userPaths.contains(paths[0])) {
			return userContent(id, paths[0], request, response, model);
		} else {

			try {
				return content(id, paths[0], request, response, model);
			} catch (NumberFormatException e) {
				return FrontUtils.pageNotFound(request, response, model);
			}
		}
	}

	@SuppressWarnings("unused")
	public String content(Integer id, String path, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		System.out.println(id);
		Content content = contentService.getContent(id);
		if (content == null) {
			System.out.println("content  is null");
			return FrontUtils.pageNotFound(request, response, model);
		}
		model.addAttribute("content", content);
		model.addAttribute("channel", content.getChannel());
		Channel leftChannel = getLeftChannel(content.getChannel());
		model.addAttribute("leftChannel", leftChannel);
		return TPL_BASE + "/" + TPLDIR_CONTENT + "/" + "zxdt";

	}

	public String userContent(Integer id, String path, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		System.out.println(id);
		Channel channel = channelService.findByPathForTag(path);

		if (id == 0) {
			Pagination page = new Pagination();
			page.setPageNo(1);
			page.setPageSize(4);
			page.setTotalCount(30);
			Pagination pagination = userService.listUsersByGroupId(5, page);

			Channel leftChannel = getLeftChannel(channel);
			model.addAttribute("leftChannel", leftChannel);
			model.addAttribute("page", pagination);
			model.addAttribute("channel", channel);

			return TPL_BASE + "/" + TPLDIR_CHANNEL + "/" + "user";
		}
		User user = userService.getUser(id);
		if (user == null) {
			System.out.println("user  is not exist!!");
			return FrontUtils.pageNotFound(request, response, model);
		}
		model.addAttribute("user", user);
		model.addAttribute("channel", channel);
		Channel leftChannel = getLeftChannel(channel);
		model.addAttribute("leftChannel", leftChannel);
		return TPL_BASE + "/" + TPLDIR_CONTENT + "/" + "user";
	}

	@Autowired
	private ContentService contentService;
	@Autowired
	private ChannelService channelService;
	@Autowired
	private UserService userService;
}
