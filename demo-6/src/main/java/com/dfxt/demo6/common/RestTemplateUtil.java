package com.dfxt.demo6.common;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
//配置spring并启动spring容器
//启动容器+@Bean注册Bean
//启动容器+@Component注册Bean
@Configuration
public class RestTemplateUtil {
	//@LoadBalanced Spring Cloud的commons模块提供 , 实现客户端负载均衡	
	@Bean
	@LoadBalanced
	public RestTemplate getRest() {
		return new RestTemplate();
	}
}
