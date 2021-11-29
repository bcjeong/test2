package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping(value = "/")
	public String myHome() {
//		ModelAndView mv = new ModelAndView();
//		
//		mv.setViewName("index");
		return "index";
//		return "index";
	}
	
	@RequestMapping(value = "/test")
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("test");
		return mv;
//		return "index";
	}

}
