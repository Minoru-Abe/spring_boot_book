package com.example.minoru.abe.personal.RequestParamSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {
	
	@GetMapping("show")
	public String showView() {
		return "input";
	}
	
	@GetMapping("result")
	public String showResultGet(@RequestParam("val") String val, Model model) {
		model.addAttribute("value", val);
		return "output";
	}
	
	@PostMapping("result")
	public String showResultPost(@RequestParam("val") String val, Model model) {
		model.addAttribute("value", val);
		return "output";
	}

}
