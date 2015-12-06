package com.minu.system.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

public class RequestMappingController {
	@RequestMapping("**/*.do")
	public ModelAndView baseController(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", "TEST");
		ModelAndView mv = new ModelAndView("hello", model);

		return mv;
	}

	@RequestMapping("mobile/**/*.do")
	@ResponseBody
	public String moblieController(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("Mobile is OK");
		
		return "{Result : Mobile Success}";
	}
	
	@ResponseBody
	public String jsonController(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("Json is OK");

		return "{Result : Success}";
	}
}
