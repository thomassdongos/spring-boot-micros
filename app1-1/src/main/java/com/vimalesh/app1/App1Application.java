package com.vimalesh.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.vimalesh")
public class App1Application {

	  
	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}
}
