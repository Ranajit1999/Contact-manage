package com.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.smart.controller"})
public class SmartContactManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartContactManagerApplication.class, args);
	}

}
