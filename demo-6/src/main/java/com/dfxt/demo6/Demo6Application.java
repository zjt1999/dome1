package com.dfxt.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class Demo6Application {

	@Autowired
	private RestTemplate rest;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);
	}
	
	@GetMapping("/home")
	public String home() {
		return rest.getForObject("http://service1/index", String.class);
	}
	
	
	@GetMapping("/dome")
	public  String  dome() {
		
 		
		return rest.getForObject("http://service1/restTemplate", String.class);
		
	}
}
