package com.vimalesh.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@ComponentScan("com.vimalesh")
public class App2Application {

	public static void main(String[] args) {
		SpringApplication.run(App2Application.class, args);
	}
}
