package com.rm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value = {"/","/app"})
	public String welcome(Model model) {
		model.addAttribute("msg","Welcome to Spring Boot, Ram");
		return "welcome";
	}
}
