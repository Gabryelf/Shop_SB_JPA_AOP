package com.example.apiGateAway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGateAwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateAwayApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("Microservice1",r->r.path("/web/**")
						.uri("http://localhost:8080/"))
				.route("Microservice2",r->r.path("/reservation/**")
						.uri("http://localhost:8081/"))
				.route("Microservice3",r->r.path("/payment/**")
						.uri("http://localhost:8082/")).build();}

}
