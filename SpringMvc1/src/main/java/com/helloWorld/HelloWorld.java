package com.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	/*
	 * @ResponseBody
	 */ public String showLoginPage() {
		return "first";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String handleUserLogin() {

		return "helloworld";
	}
}
