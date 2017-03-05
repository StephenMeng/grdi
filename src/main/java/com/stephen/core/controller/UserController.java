package com.stephen.core.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.stephen.common.web.FrontUtils;
import com.stephen.core.model.User;
import com.stephen.core.model.UserAttr;
import com.stephen.core.model.UserExt;
import com.stephen.core.page.Pagination;
import com.stephen.core.security.encoder.MD5PwdEncoder;
import com.stephen.core.security.encoder.PwdEncoder;
import com.stephen.core.service.ChannelService;
import com.stephen.core.service.UserService;
import static com.stephen.common.web.Constants.TPL_BASE;

@Controller
public class UserController {
	public static final String USER_DEFAULT = "user";
	public static final String USER_LIST_DEFAULT = "userlist";
	public static final String CONTENT_DEFAULT = "user";
	public static final String TPLDIR_USER = "user";
	public static final String PAGE_NOT_FOUND = "pageNotFound";
	public static final String TPLDIR_COMMON = "common";
	@Autowired
	private ChannelService channelService;
	@Autowired
	private UserService userService;

	@RequestMapping(value = "user-{id}.do")
	public String user(@PathVariable String id, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		System.out.println(id);
		User user = userService.getUser(Integer.parseInt(id));
		System.out.println(user.getUserId());
		if (user == null) {
			return FrontUtils.pageNotFound(request, response, model);
		}

		model.put("user", user);
		FrontUtils.frontData(request, model);
		return FrontUtils.getTplPath(request, TPL_BASE, TPLDIR_USER, USER_DEFAULT);
	}

	@RequestMapping(value = "user-save.html")
	public String saveUser(HttpServletRequest request, ModelMap map) {
		User user = new User();
		UserExt ext = new UserExt();
		List<UserAttr> attrs = new ArrayList<>();

		String location = request.getParameter("location");
		if (location != null) {
			UserAttr attr = new UserAttr();
			attr.setAttrName("location");
			attr.setAttrValue(location);
			attrs.add(attr);
		}

		String password = new MD5PwdEncoder().encodePassword(request.getParameter("password"));
		user.setUsername(request.getParameter("username"));
		user.setPassword(password);
		ext.setGender(Integer.parseInt(request.getParameter("gender")) == 1 ? true : false);
		FrontUtils.frontData(request, map);
		user.setGroupId(5);
		user.setRegisterTime(new Date(System.currentTimeMillis()));
		user.setLastLoginTime(new Date(System.currentTimeMillis()));
		user.setRegisterIp(request.getLocalAddr());
		user.setLastLoginIp(request.getLocalAddr());
		user.setLoginCount(1);
		user.setRank(0);
		user.setUploadSize(0);
		user.setUploadTotal((long) 0);
		user.setIsAdmin(false);
		user.setIsSelfAdmin(false);
		user.setIsDisabled(false);

		ext.setRealname(user.getUsername() + "realname");
		user.setUserExt(ext);

		user.setUserAttr(attrs);

		userService.saveUser(user);
		System.out.println("save success!!!");

		return FrontUtils.TPL_BASE + "/index";
	}

	@RequestMapping(value = "detail-save.do")
	public String saveUserDetail(HttpServletRequest request, UserExt ext, User user) {
		System.out.println("save success!!!");
		// UserExt ext=new UserExt();
		System.out.println(ext.getRealname());
		userService.saveUserExt(ext);
		return "/index";
	}

	@RequestMapping(value = "user-list.do")
	public String userlist(HttpServletRequest request, ModelMap model) {
		System.out.println("list start....");
		Pagination page = new Pagination();
		page.setPageNo(1);
		page.setPageSize(20);
		page = userService.listUsers(page);
		model.put("page", page);
		FrontUtils.frontData(request, model);
		return FrontUtils.getTplPath(request, TPL_BASE, TPLDIR_USER, USER_LIST_DEFAULT);
	}

	@RequestMapping(value = "user-delete.do")
	public String deleteUser(HttpServletRequest request) {
		// System.out.println(request.getParameter("userId"));
		int id = Integer.parseInt(request.getParameter("userId"));
		userService.deleteUser(id);
		return "/index";
	}
}
