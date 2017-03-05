package com.stephen.cms.controller.admin;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

	@RequestMapping("/index.do")
	public String index() {
		return "index";
	}

	@RequestMapping("left.do")
	public String a(HttpServletRequest request, HttpSession session) {
		return "test/left";
	}

	@RequestMapping("right.do")
	public String c(ModelMap map) {
		return "test/right";
	}
}
