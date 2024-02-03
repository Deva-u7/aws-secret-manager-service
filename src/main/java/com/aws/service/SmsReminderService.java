package com.aws.service;

import com.aws.dto.SmsReminderDTO;
import com.aws.entity.SmsReminderEntity;
import com.aws.repository.SmsReminderRepository;
import org.springframework.stereotype.Service;

@Service
public class SmsReminderService {
    private final SmsReminderRepository smsReminderRepository;

    public SmsReminderService(SmsReminderRepository smsReminderRepository) {
        this.smsReminderRepository = smsReminderRepository;
    }

    public SmsReminderDTO getSmsById(long id ) {
        try {
            SmsReminderEntity smsReminderEntity = smsReminderRepository.findById(id).orElseThrow();
            return mapToDTO(smsReminderEntity);
        }catch (Exception ex){
            throw new RuntimeException("Sms Reminder Not found");
        }
    }

    private SmsReminderDTO mapToDTO(SmsReminderEntity it) {
        return SmsReminderDTO.builder()
                    .id(it.getId())
                    .accountNumber(it.getAccountNumber())
                    .customerNumber(it.getCustomerNumber())
                    .message(it.getMessage())
                    .msisdn(it.getMsisdn())
                    .messageId(it.getMessageId())
                    .isWeekly(it.getIsWeekly())
                    .frequency(it.getFrequency())
                    .createdBy(it.getCreatedBy())
                    .lastModifiedBy(it.getLastModifiedBy())
                    .createdDate(it.getCreatedDate())
                    .lastModifiedDate(it.getLastModifiedDate())
                    .build();
    }
}
