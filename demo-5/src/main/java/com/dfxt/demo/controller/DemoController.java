package com.dfxt.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class DemoController {

	
	@GetMapping("/index")
	public String httptest() {
		return "调用成功";
	}
	
	@GetMapping("restTemplate")
	public String restTemplate() {
		 
		return "KDBJDBKC SKDGUIDS";
		
		
		
	}
}
