package com.call_logs.system.dto;

public class BillRequest {

	private String workDescription;
	private Double totalBillAmount;
	private String customerEmail;
	
	public BillRequest() {
		// TODO Auto-generated constructor stub
	}

	public BillRequest(String workDescription, Double totalBillAmount, String customerEmail) {
		super();
		this.workDescription = workDescription;
		this.totalBillAmount = totalBillAmount;
		this.customerEmail = customerEmail;
	}

	public String getWorkDescription() {
		return workDescription;
	}

	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}

	public Double getTotalBillAmount() {
		return totalBillAmount;
	}

	public void setTotalBillAmount(Double totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
	
	
}
