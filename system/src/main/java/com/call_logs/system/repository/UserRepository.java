package com.call_logs.system.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.call_logs.system.entity.User;
import com.call_logs.system.enums.Role;

public interface UserRepository extends JpaRepository<User, Long> {
	
    Optional<User> findByUsernameAndPassword(String username, String password);
    
    List<User> findByRole(Role role);
}
