package com.abeosoft.microservices.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulRegistryApplication.class, args);
	}
}
