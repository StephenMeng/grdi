package com.stephen.core.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stephen.common.web.FrontUtils;
import com.stephen.core.model.Content;
import com.stephen.core.service.ContentService;

@Controller
public class ContentController {
	@RequestMapping("content/{id}.do")
	public String getContent(HttpServletRequest request, @PathVariable String id,ModelMap map) {
		String solution = "/WEB-INF/t/cms/tpl/default";
		String dir = "content";
		String name = "news";
		Content content=contentService.getContent(1);
		map.put("content", content);
		return FrontUtils.getTplPath(request, solution, dir, name);
	}

	@Autowired
	private ContentService contentService;
}
