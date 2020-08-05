package com.cap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	@GetMapping("/orderFallback")
	@HystrixCommand
	public Mono<String> orderServiceFallback() {
		return Mono.just("Order Service Failed");

	}

	@GetMapping("/paymentFallback")
	public Mono<String> paymentServiceFallback() {
		return Mono.just("Payment Service Failed");
	}

}
