package com.call_logs.system.service;

import java.util.List;

import com.call_logs.system.dto.LoginRequest;
import com.call_logs.system.dto.LoginResponse;
import com.call_logs.system.entity.User;

public interface UserService {

	   	LoginResponse login(LoginRequest request);
	    User getById(Long id);
	    User createEmployee(User user);
	    
	    List<User> getAllEmployees();
}
