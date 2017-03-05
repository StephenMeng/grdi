package com.stephen.core.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.stephen.common.web.FrontUtils;

@Controller
public class FileUploadController {
	@RequestMapping(value = "/upload.html", method = RequestMethod.POST)
	public String upload(HttpServletRequest request, @RequestParam("fileName") MultipartFile file, ModelMap map) {
		System.out.println("uploadFile");
		System.out.println("username" + request.getParameter("username"));

		InputStream iStream;
		try {
			String dir = request.getSession().getServletContext().getRealPath("/upload/img") + "/";
			String newFileName = UUID.randomUUID() + file.getOriginalFilename();
			System.out.println(dir);
			System.out.println(newFileName);
			File f = new File(dir);
			if (!f.exists()) {
				f.mkdirs();
			}
			iStream = file.getInputStream();
			File outFile = new File(dir, newFileName);
			OutputStream oStream = new FileOutputStream(outFile);
			byte[] bs = new byte[1024];
			int len = 0;
			while ((len = iStream.read(bs)) > 0) {
				oStream.write(bs, 0, len);
			}
			iStream.close();
			oStream.close();
		} catch (

		IOException e)

		{
			e.printStackTrace();
		}
		FrontUtils.frontData(request, map);
		return FrontUtils.TPL_BASE + "/index";
	}

	@RequestMapping(value = "/upload2.html", method = RequestMethod.POST)
	public String upload2(HttpServletRequest request, ModelMap map) {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());

		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
			Iterator<String> iterator = mRequest.getFileNames();
			while (iterator.hasNext()) {
				MultipartFile file=mRequest.getFile(iterator.next());
				if (file!=null) {
					System.out.println(file.getOriginalFilename());
				}
			}
		}
		FrontUtils.frontData(request, map);
		return FrontUtils.TPL_BASE + "/index";
	}
}
