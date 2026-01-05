package com.call_logs.system.dto;

public class EmployeeDispatchRequest {

	 private String customerName;
	    private String mobileNumber;
	    private String address;
	    private Long assignedEmployeeId;
    
    public EmployeeDispatchRequest() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDispatchRequest(String customerName, String mobileNumber, String address, Long assignedEmployeeId) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.assignedEmployeeId = assignedEmployeeId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getAssignedEmployeeId() {
		return assignedEmployeeId;
	}

	public void setAssignedEmployeeId(Long assignedEmployeeId) {
		this.assignedEmployeeId = assignedEmployeeId;
	}

	
	
}
