package com.call_logs.system.dto;

public class LoginResponse {

	   private Long userId;
	   private String username;
	   private String role;
	    
	   public LoginResponse() {
		// TODO Auto-generated constructor stub
	}

	   public LoginResponse(Long userId, String username, String role) {
		super();
		this.userId = userId;
		this.username = username;
		this.role = role;
	   }

	   public Long getUserId() {
		   return userId;
	   }

	   public void setUserId(Long userId) {
		   this.userId = userId;
	   }

	   public String getUsername() {
		   return username;
	   }

	   public void setUsername(String username) {
		   this.username = username;
	   }

	   public String getRole() {
		   return role;
	   }

	   public void setRole(String role) {
		   this.role = role;
	   }
	   
	   
}
