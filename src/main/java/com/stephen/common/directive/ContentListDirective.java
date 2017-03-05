package com.stephen.common.directive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.stephen.core.model.Content;
import com.stephen.core.service.ContentService;

import freemarker.core.Environment;
import freemarker.template.ObjectWrapper;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateNumberModel;

public class ContentListDirective implements TemplateDirectiveModel {
	@Autowired
	private ContentService contentService;

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopvars, TemplateDirectiveBody body)
			throws TemplateException, IOException {
		System.out.println("directive begins!");
		if (params == null || params.size() == 0) {
			throw new TemplateException("params can not be empty", env);
		}
		int count = 0;
		for (Object key : params.keySet()) {
			String name = (String) key;
			if (name.equalsIgnoreCase("id")) {
				if (params.get(key) instanceof TemplateNumberModel) {
					count = ((TemplateNumberModel) params.get(key)).getAsNumber().intValue();
				}
			}
		}
		List<Content> contents = new ArrayList<>();
		for (int i = 1; i <= count; i++) {
			contents.add(contentService.getContent(1));
		}
		env.setVariable("contentList", ObjectWrapper.DEFAULT_WRAPPER.wrap(contents));
		if (body != null) {
			body.render(env.getOut());
		}
	}

}
