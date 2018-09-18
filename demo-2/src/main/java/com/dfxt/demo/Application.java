package com.dfxt.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.dfxt.demo.dao")
@ComponentScan("com.dfxt")
@Configurable
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
