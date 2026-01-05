package com.call_logs.system.dto;

public class CallLogRequest {

	 	private String customerName;
	    private String mobileNumber;
	    private String systemType;
	    private String description;
	    private Long receivedBy; // User ID
	    
	    public CallLogRequest() {
			// TODO Auto-generated constructor stub
		}

		public CallLogRequest(String customerName, String mobileNumber, String systemType, String description,
				Long receivedBy) {
			super();
			this.customerName = customerName;
			this.mobileNumber = mobileNumber;
			this.systemType = systemType;
			this.description = description;
			this.receivedBy = receivedBy;
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

		public String getSystemType() {
			return systemType;
		}

		public void setSystemType(String systemType) {
			this.systemType = systemType;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getReceivedBy() {
			return receivedBy;
		}

		public void setReceivedBy(Long receivedBy) {
			this.receivedBy = receivedBy;
		}
	    
	    
	    
}
