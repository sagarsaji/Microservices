package com.ust.springbootwithfeigenclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootwithfeigenclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithfeigenclientApplication.class, args);
	}

}
