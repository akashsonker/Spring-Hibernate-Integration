package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService user;
	@RequestMapping(value = "/login")
	public String loginForm() {
		user.addUser();
		return "home";
	}
}
