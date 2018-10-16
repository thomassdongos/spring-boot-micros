package com.vimalesh.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vimalesh")
@EnableConfigServer
public class App1Application {

	  
	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}
}
