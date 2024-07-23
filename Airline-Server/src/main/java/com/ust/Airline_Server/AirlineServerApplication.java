package com.ust.Airline_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AirlineServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineServerApplication.class, args);
	}

}
