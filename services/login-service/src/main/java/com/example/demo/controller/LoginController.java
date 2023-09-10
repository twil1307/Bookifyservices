package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HomeService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	
	@GetMapping
	public String getLogin() {
		return "This is login page " + HomeService.getHome();
	}
}
