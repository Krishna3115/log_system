package com.call_logs.system.dto;

public class PaymentRequest {

	private Double paidAmount;
    private String paymentMethod; // "UPI", "CASH", "BOTH"
    private boolean fullPayment;
    
    public PaymentRequest() {
		// TODO Auto-generated constructor stub
	}

	public PaymentRequest(Double paidAmount, String paymentMethod, boolean fullPayment) {
		super();
		this.paidAmount = paidAmount;
		this.paymentMethod = paymentMethod;
		this.fullPayment = fullPayment;
	}

	public Double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public boolean isFullPayment() {
		return fullPayment;
	}

	public void setFullPayment(boolean fullPayment) {
		this.fullPayment = fullPayment;
	}
    
    
}
