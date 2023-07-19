package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request")
public class RequestController {

	@RequestMapping("/req_ex01")
	public String ex01() {
		
		return "request/req_ex01";
	}
	
	@RequestMapping("/basic1")
	public String basic1() {
		
		return "request/basic1";
	}
	
}
