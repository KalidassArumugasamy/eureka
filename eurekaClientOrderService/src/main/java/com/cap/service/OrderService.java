package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cap.common.Payment;
import com.cap.common.TransactionRequest;
import com.cap.common.TransactionResponse;
import com.cap.entity.Orders;
import com.cap.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private RestTemplate restTemplate;

	public TransactionResponse saveOrder(TransactionRequest request) {

		String response = "";
		Orders order = request.getOrder();
		Payment payment = request.getPayment();

		Orders orders =orderRepository.save(order);
		payment.setOrderId(orders.getId());
		payment.setAmount(order.getPrice());
		Payment paymentResponse = restTemplate.postForObject("http://Payment-Service/payment/doPayment", payment,
				Payment.class);
		response = paymentResponse.getPaymentStatus().equals("succes") ? "Payment Processing"
				: "There is some failure in Order and Payment";
		

		return new TransactionResponse(order, payment.getAmount(), payment.getTransactionId(), response);

	}

}
