package com.aws.controller;

import com.aws.dto.SmsReminderDTO;
import com.aws.service.SmsReminderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SmsReminderController {

    private final SmsReminderService smsReminderService;
    public SmsReminderController(SmsReminderService smsReminderService) {
        this.smsReminderService = smsReminderService;
    }
    @GetMapping("api/sms/{id}")
    ResponseEntity<SmsReminderDTO> getSmsById(@PathVariable Long id){
        return ResponseEntity.ok( smsReminderService.getSmsById(id));
    }
}
