package com.call_logs.system.dto;

public class UserDTO {

	  private Long id;
	    private String username;
	    
	    public UserDTO() {
			// TODO Auto-generated constructor stub
		}

		public UserDTO(Long id, String username) {
			super();
			this.id = id;
			this.username = username;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
	    
	    
}
