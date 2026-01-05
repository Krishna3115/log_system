package com.call_logs.system.dto;

public class EmailQueryRequest {

	  	private String description;
	    private String email;
	    private String systemNumber;
	    private String customerName;
	    private String status;
	    
	    public EmailQueryRequest() {
			// TODO Auto-generated constructor stub
		}

		public EmailQueryRequest(String description, String email, String systemNumber, String customerName,
				String status) {
			super();
			this.description = description;
			this.email = email;
			this.systemNumber = systemNumber;
			this.customerName = customerName;
			this.status = status;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSystemNumber() {
			return systemNumber;
		}

		public void setSystemNumber(String systemNumber) {
			this.systemNumber = systemNumber;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	    
	    
}
