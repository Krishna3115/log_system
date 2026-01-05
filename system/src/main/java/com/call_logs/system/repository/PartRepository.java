package com.call_logs.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.call_logs.system.entity.Part;


public interface PartRepository extends JpaRepository<Part, Long> {
    // You can add custom queries here if needed later
}
