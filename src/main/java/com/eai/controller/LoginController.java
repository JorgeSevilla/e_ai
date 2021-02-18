package com.eai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("api")
public class LoginController {
	
	@GetMapping(value = {"/login", "/"})
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		String errorMessage = "Usuário não te autorização, deve se logar";
		mav.addObject("errorMsg", errorMessage);
		mav.setViewName("login");
		return mav;
	}
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}

}
