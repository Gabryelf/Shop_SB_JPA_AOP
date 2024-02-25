package com.example.payShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.payShop.aspect")
public class PayShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayShopApplication.class, args);
	}

}
