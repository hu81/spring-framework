package com.hu81.controller;

import com.hu81.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {
	@Autowired
	private WelcomeService welcomeService;

	public String sayHi(String toUser) {
		return welcomeService.sayHi(toUser);
	}

	public void setWelcomeService(WelcomeService welcomeService) {
		this.welcomeService = welcomeService;
	}
}
