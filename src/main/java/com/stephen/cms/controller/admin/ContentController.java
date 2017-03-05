package com.stephen.cms.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.web.filter.authz.SslFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.stephen.common.web.FrontUtils;
import com.stephen.common.web.RequestUtils;
import com.stephen.core.model.User;
import com.stephen.core.model.UserAttr;
import com.stephen.core.model.UserExt;
import com.stephen.core.page.Pagination;
import com.stephen.core.security.encoder.MD5PwdEncoder;
import com.stephen.core.service.UserService;

@Controller
public class ContentController {
	@RequestMapping("c-list.do")
	public String list(HttpServletRequest request, ModelMap map) {
		FrontUtils.frontData(request, map);
		Pagination pagination = RequestUtils.getPagenation(request);

		Pagination page = userService.listUsers(pagination);
		map.put("page", page);
		return "content/list";
	}

	@RequestMapping("c-toadd-1.do")
	public String toadd1(HttpServletRequest request, ModelMap map, HttpSession session) {
		return "content/add-1";
	}

	@RequestMapping("c-toadd-2.do")
	public String toadd2(HttpServletRequest request, ModelMap map, HttpSession session) {
		User user = new User();

		user.setUsername("newname" + new Random().nextInt(100));
		user.setPassword("");
		user.setGroupId(5);
		user.setRegisterTime(new Date(System.currentTimeMillis()));
		user.setLastLoginTime(new Date(System.currentTimeMillis()));
		user.setRegisterIp(request.getRemoteAddr());
		user.setLastLoginIp(request.getRemoteAddr());
		user.setLoginCount(1);
		user.setRank(0);
		user.setUploadSize(0);
		user.setUploadTotal((long) 0);
		user.setIsAdmin(false);
		user.setIsSelfAdmin(false);
		user.setIsDisabled(false);

		UserExt ext = new UserExt();
		List<UserAttr> attrs = new ArrayList<>();
		ext.setRealname(user.getUsername() + "realname");
		user.setUserExt(ext);
		user.setUserAttr(attrs);

		session.setAttribute("user_add", user);
		return "content/add-2";
	}

	@RequestMapping(value = ("c-add.do"), method = RequestMethod.POST)
	public String add(HttpServletRequest request, ModelMap map, HttpSession session) {
		User user = (User) session.getAttribute("user_add");
		String dbUrl = "/WEB-INF/upload/img";
		String dir = request.getSession().getServletContext().getRealPath(dbUrl) + "/";
		File f = new File(dir);
		if (!f.exists()) {
			f.mkdirs();
		}
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
			Iterator<String> iterator = mRequest.getFileNames();
			while (iterator.hasNext()) {
				String fname = iterator.next();
				MultipartFile file = mRequest.getFile(fname);

				if (file != null && !file.getOriginalFilename().equals("")) {
					String newFileName = UUID.randomUUID() + "-" + file.getOriginalFilename();
					System.out.println(newFileName);
					File localFile = new File(dir, newFileName);
					try {
						file.transferTo(localFile);
						user.setUserImg(dbUrl + "/" + newFileName);
					} catch (IllegalStateException | IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		userService.saveUser(user);
		session.removeAttribute("user_add");
		return "redirect:c-list.do";
	}

	@RequestMapping("c-toupdate.do")
	public String update(HttpServletRequest request, ModelMap map) {
		return "content/update";
	}

	@RequestMapping("c-delete.do")
	public String delete(HttpServletRequest request, ModelMap map) {
		int id = Integer.parseInt(request.getParameter("userId"));
		userService.deleteUser(id);
		return "redirect:c-list.do";
	}

	@RequestMapping("c-detail.do")
	public String detail(HttpServletRequest request, ModelMap map) {
		System.out.println(request.getParameter("userId"));
		int id = Integer.parseInt(request.getParameter("userId"));
		User user = userService.getUser(id);
		map.put("user", user);
		return "content/detail";
	}

	@Autowired
	private UserService userService;
}
