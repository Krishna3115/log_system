package com.call_logs.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.call_logs.system.entity.CallLogQuery;

public interface CallLogQueryRepository extends JpaRepository<CallLogQuery, Long> {
	
    List<CallLogQuery> findByCallLogId(Long callLogId);
    
  }
