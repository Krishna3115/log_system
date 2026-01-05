package com.call_logs.system.service;

import com.call_logs.system.dto.EmailQueryRequest;

public interface CallLogQueryService {

	// CallLogQueryService.java

	void saveAndSendEmailQuery(Long callLogId, EmailQueryRequest req);

}
