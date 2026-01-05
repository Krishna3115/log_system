package com.call_logs.system.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CallLogQuery {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@ManyToOne
	@JoinColumn(name = "call_log_id")
	@JsonBackReference
	private CallLog callLog;
	
    @Column(length = 2000)
    private String description;
    private LocalDateTime createdAt;
    
    
	   
    public CallLogQuery() {
		// TODO Auto-generated constructor stub
	}


	public CallLogQuery(Long id, CallLog callLog, String description, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.callLog = callLog;
		this.description = description;
		this.createdAt = createdAt;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public CallLog getCallLog() {
		return callLog;
	}


	public void setCallLog(CallLog callLog) {
		this.callLog = callLog;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
    
    
	
    
}
