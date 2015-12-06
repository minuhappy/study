package com.minu.system.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class BaseMappingController extends AbstractController{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", "TEST");
		ModelAndView mv = new ModelAndView("hello", model);

		return mv;
	}
}
