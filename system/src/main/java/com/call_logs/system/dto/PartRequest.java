package com.call_logs.system.dto;

public class PartRequest {

	  private String partName;
	  private boolean available;
	  
	  public PartRequest() {
		// TODO Auto-generated constructor stub
	}

	  public PartRequest(String partName, boolean available) {
		super();
		this.partName = partName;
		this.available = available;
	  }

	  public String getPartName() {
		  return partName;
	  }

	  public void setPartName(String partName) {
		  this.partName = partName;
	  }

	  public boolean isAvailable() {
		  return available;
	  }

	  public void setAvailable(boolean available) {
		  this.available = available;
	  }

	  
	  
}
