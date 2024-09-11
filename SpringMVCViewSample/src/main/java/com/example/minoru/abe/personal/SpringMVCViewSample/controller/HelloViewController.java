package com.example.minoru.abe.personal.SpringMVCViewSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hello")
public class HelloViewController {
	
	@GetMapping("model")
	public String helloView(Model model) {
		model.addAttribute("msg", "thymeleaf!");
		return "helloThymeleaf";
	}
	
	@GetMapping("modelandview")
	public ModelAndView helloView2(ModelAndView modelAndView) {
		modelAndView.addObject("msg", "thymeleaf!!!!!!!!!!!!!");
		modelAndView.setViewName("helloThymeleaf");
		return modelAndView;
		
	}

}
