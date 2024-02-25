package com.example.reserveShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.reserveShop.aspect")
public class ReserveShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReserveShopApplication.class, args);
	}

}
