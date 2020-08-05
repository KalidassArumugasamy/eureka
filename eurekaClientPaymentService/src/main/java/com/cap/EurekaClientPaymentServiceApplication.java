package com.cap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientPaymentServiceApplication.class, args);
	}

}
