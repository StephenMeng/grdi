package com.stephen.cms.controller.admin;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControlller {

	@RequestMapping("/member.do")
	public String member() {
		return "member/member";
	}
}
