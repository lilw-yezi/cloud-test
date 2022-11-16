package com.yz.cloud.cloudtest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Cloudtest1CopyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cloudtest1CopyApplication.class, args);
	}

}
