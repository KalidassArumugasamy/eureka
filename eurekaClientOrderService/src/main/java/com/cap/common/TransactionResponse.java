package com.cap.common;

import com.cap.entity.Orders;

public class TransactionResponse {

	private Orders order;
	private double amount;
	private String transactionID;
	private String message;

	public TransactionResponse() {
		super();
	}

	public TransactionResponse(Orders order, double amount, String transactionID, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionID = transactionID;
		this.message = message;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
