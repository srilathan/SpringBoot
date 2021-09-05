package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/")
	public String display() {
		return "index";
	}

	@RequestMapping("/hello")
	public String display1() {
		return "index";
	}
}
