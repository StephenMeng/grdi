package com.stephen.cms.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stephen.common.web.Constants;
import com.stephen.common.web.RequestUtils;
import com.stephen.core.model.User;
import com.stephen.core.service.UserService;

@Controller
public class LoginController {

	private String userId;
	private String password;

	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request, HttpSession session, ModelAndView modelView) {
		String userid = getUserId();
		String password = getPassword();
		System.out.print(userid);
		System.out.println("login!!");
		Subject subject = SecurityUtils.getSubject();
		User user = new User();
		UsernamePasswordToken token = new UsernamePasswordToken(userid, password);
		token.setRememberMe(true);
		try {
			subject.login(token);
			System.out.println("验证通过");
			user = userService.getUser(Integer.parseInt(userid));
			session.setAttribute(Constants.USER_INFO, user);
			modelView.addObject(Constants.USER_INFO, RequestUtils.getUser(session));
			modelView.setViewName("redirect:index.do");
		} catch (AuthenticationException e) {
			e.printStackTrace();
			modelView.addObject("message", "login errors");
			modelView.setViewName("/error");
		}
		return modelView;
	}

	@Autowired
	private UserService userService;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
