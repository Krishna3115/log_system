package com.call_logs.system.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.call_logs.system.dto.EmailQueryRequest;
import com.call_logs.system.entity.CallLog;
import com.call_logs.system.entity.CallLogQuery;
import com.call_logs.system.repository.CallLogQueryRepository;
import com.call_logs.system.repository.CallLogRepository;

@Service
public class CallLogQueryServiceImpl implements CallLogQueryService {

    private final CallLogRepository callLogRepository;
    private final CallLogQueryRepository callLogQueryRepository;
    private final JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String senderEmail;

    public CallLogQueryServiceImpl(
        CallLogRepository callLogRepository,
        CallLogQueryRepository callLogQueryRepository,
        JavaMailSender mailSender
    ) {
        this.callLogRepository = callLogRepository;
        this.callLogQueryRepository = callLogQueryRepository;
        this.mailSender = mailSender;
    }

    @Override
    public void saveAndSendEmailQuery(Long callLogId, EmailQueryRequest req) {
        // 1. Find CallLog by id, throw if not found
        CallLog callLog = callLogRepository.findById(callLogId)
                .orElseThrow(() -> new RuntimeException("CallLog not found with id: " + callLogId));

        // 2. Create and save CallLogQuery entity
        CallLogQuery query = new CallLogQuery();
        query.setCallLog(callLog);
        query.setDescription(req.getDescription());
        query.setCreatedAt(LocalDateTime.now());
        callLogQueryRepository.save(query);

        // 3. Prepare and send email
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(req.getEmail());
        message.setSubject("Query Regarding System: " + req.getSystemNumber());
        message.setFrom(senderEmail);

        StringBuilder content = new StringBuilder();
        content.append("Customer Name: ").append(req.getCustomerName()).append("\n");
        content.append("System Number: ").append(req.getSystemNumber()).append("\n");
        content.append("Status: ").append(req.getStatus()).append("\n\n");
        content.append("Description:\n").append(req.getDescription());

        message.setText(content.toString());

        mailSender.send(message);
    }
	
}
