package com.call_logs.system.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Part {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partName;

    private boolean available;

	@ManyToOne
	@JoinColumn(name = "call_log_id")
	@JsonBackReference
	private CallLog callLog;

    
    private int quantity;

    
    public Part() {
		// TODO Auto-generated constructor stub
	}


	public Part(Long id, String partName, boolean available, CallLog callLog, int quantity) {
		super();
		this.id = id;
		this.partName = partName;
		this.available = available;
		this.callLog = callLog;
		this.quantity = quantity;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPartName() {
		return partName;
	}


	public void setPartName(String partName) {
		this.partName = partName;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public CallLog getCallLog() {
		return callLog;
	}


	public void setCallLog(CallLog callLog) {
		this.callLog = callLog;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

    
	
}
