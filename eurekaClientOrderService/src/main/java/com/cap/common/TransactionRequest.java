package com.cap.common;

import com.cap.entity.Orders;

public class TransactionRequest {

	private Orders order;
	private Payment payment;

	public TransactionRequest() {
		super();
	}

	public TransactionRequest(Orders order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
}
