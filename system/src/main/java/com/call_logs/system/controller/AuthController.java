package com.call_logs.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.call_logs.system.dto.LoginRequest;
import com.call_logs.system.dto.LoginResponse;
import com.call_logs.system.dto.UserDTO;
import com.call_logs.system.entity.User;
import com.call_logs.system.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(userService.login(request));
    }
    
    // 🔽 Endpoint to fetch employees only

    @GetMapping("/employees")
    public List<UserDTO> getAllEmployees() {
        return userService.getAllEmployees()
                .stream()
                .map(user -> new UserDTO(user.getId(), user.getUsername()))
                .toList();
    }
    
}
