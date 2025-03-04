package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/welcome")
	// http://localhost:8080/SpringWe/welcome
	
	public String getPage() {
		System.out.println("Hello");
		return "Home";
		// it will search forHome.jsp under WEB-INF/pages folder
	}
}
