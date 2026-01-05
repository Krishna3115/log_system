package com.call_logs.system.dto;

public class SystemReceiveRequest {

	   private String systemNumber;
	   private String receivedAccessories;
	    private String receivedBy; // Or Long if you're using numbers
	    private String deliveryDate;
	    private String deliveryTime;

	    
	    public SystemReceiveRequest() {
			// TODO Auto-generated constructor stub
		}


		public SystemReceiveRequest(String systemNumber, String receivedAccessories, String receivedBy,
				String deliveryDate, String deliveryTime) {
			super();
			this.systemNumber = systemNumber;
			this.receivedAccessories = receivedAccessories;
			this.receivedBy = receivedBy;
			this.deliveryDate = deliveryDate;
			this.deliveryTime = deliveryTime;
		}


		public String getSystemNumber() {
			return systemNumber;
		}


		public void setSystemNumber(String systemNumber) {
			this.systemNumber = systemNumber;
		}


		public String getReceivedAccessories() {
			return receivedAccessories;
		}


		public void setReceivedAccessories(String receivedAccessories) {
			this.receivedAccessories = receivedAccessories;
		}


		public String getReceivedBy() {
			return receivedBy;
		}


		public void setReceivedBy(String receivedBy) {
			this.receivedBy = receivedBy;
		}


		public String getDeliveryDate() {
			return deliveryDate;
		}


		public void setDeliveryDate(String deliveryDate) {
			this.deliveryDate = deliveryDate;
		}


		public String getDeliveryTime() {
			return deliveryTime;
		}


		public void setDeliveryTime(String deliveryTime) {
			this.deliveryTime = deliveryTime;
		}

		
		
}
