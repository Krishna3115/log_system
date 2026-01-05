package com.call_logs.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.call_logs.system.dto.LoginRequest;
import com.call_logs.system.dto.LoginResponse;
import com.call_logs.system.entity.User;
import com.call_logs.system.enums.Role;
import com.call_logs.system.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public LoginResponse login(LoginRequest request) {
        Optional<User> userOpt = userRepository.findByUsernameAndPassword(
                request.getUsername(), request.getPassword()
        );

        if (userOpt.isPresent()) {
            User user = userOpt.get();
            LoginResponse response = new LoginResponse();
            response.setUserId(user.getId());
            response.setUsername(user.getUsername());
            response.setRole(user.getRole().name());
            return response;
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }

    @Override
    public User createEmployee(User user) {
        user.setRole(Role.EMPLOYEE);
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
    
    @Override
    public List<User> getAllEmployees() {
        return userRepository.findByRole(Role.EMPLOYEE);
    }

}
