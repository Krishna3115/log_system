package com.call_logs.system.dto;

public class QueryRequest {

	 private String description;
	 
	 public QueryRequest() {
		// TODO Auto-generated constructor stub
	}

	 public QueryRequest(String description) {
		super();
		this.description = description;
	 }

	 public String getDescription() {
		 return description;
	 }

	 public void setDescription(String description) {
		 this.description = description;
	 }
	 
	 
}
