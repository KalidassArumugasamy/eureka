package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.common.TransactionRequest;
import com.cap.service.OrderService;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	public OrderService orderServices;

	@PostMapping("/bookOrder")
	@Hystrix
	public void bookOrder(@RequestBody TransactionRequest request) {
		orderServices.saveOrder(request);

	}

	@PostMapping("/bookOrder")
	public void bookOrderFallback(@RequestBody TransactionRequest request) {
		orderServices.saveOrder(request);

	}
}
