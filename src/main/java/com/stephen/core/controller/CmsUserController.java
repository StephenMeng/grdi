package com.stephen.core.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stephen.common.web.FrontUtils;
import com.stephen.core.model.Channel;
import com.stephen.core.model.CmsUser;
import com.stephen.core.model.User;
import com.stephen.core.security.encoder.MD5PwdEncoder;
import com.stephen.core.service.ChannelService;
import com.stephen.core.service.CmsUserService;

@Controller
public class CmsUserController {
	@RequestMapping("cmsuser-save.do")
	public String register(HttpServletRequest request, @ModelAttribute("user") CmsUser user) {
		// User user=(User) request.getAttribute("user");
		System.out.println(user.getPassword());
		user.setRegisterTime(new Date(System.currentTimeMillis()));
		user.setLastLoginTime(new Date(System.currentTimeMillis()));
		user.setRegisterIp(request.getRemoteAddr());
		user.setLastLoginIp(request.getRemoteAddr());
		user.setLoginCount(1);
		user.setErrorCount(1);
		user.setErrorIp("1");
		user.setErrorTime(new Date(System.currentTimeMillis()));
		user.setActivation(true);
		System.out.println(request.getRemoteHost() + "|" + request.getRemotePort() + "|" + request.getRemoteAddr());
		String password = user.getPassword();
		user.setPassword(new MD5PwdEncoder().encodePassword(password));
		cmsUserService.register(user);
		return "OK";
	}


	@RequestMapping("login.do")
	public String login(HttpServletRequest request) {
		String userid = (String) request.getParameter("userid");
		System.out.println(userid + "******");
		String password = (String) request.getParameter("password");
		System.out.println("login!!");
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(userid, new MD5PwdEncoder().encodePassword(password));
		token.setRememberMe(true);
		try {
			// 这句是提交申请，验证能不能通过，也就是交给公安局同志了。这里会回调reaml里的一个方法
			// 回调doGetAuthenticationInfo，进行认证
			subject.login(token);
			System.out.println("验证通过");
		} catch (AuthenticationException e) {
			// modelView.addObject("message", "login errors");
			// modelView.setViewName("/login");
			e.printStackTrace();
			// return modelView;
		}
		// 验证是否通过
		if (subject.isAuthenticated()) {
			// user.setUserName("张三");
			// session.setAttribute("userinfo", user);
			// modelView.setViewName("/main");
		} else {
			// modelView.addObject("message", "login errors");
			// modelView.setViewName("/login");
		}
		return "index";
	}

	@Autowired
	private CmsUserService cmsUserService;
	@Autowired
	private ChannelService channelService;
}
