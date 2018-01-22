package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

	public static final String STUDENT_SERVICE = "http://STUDENT-SERVICE";
	public static final String EMPLOYEE_SERVICE = "http://EMPLOYEE-SERVICE";
	
	public static void main(String[] args) {
		System.out.println("********* Discovery Server Started *********");
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
