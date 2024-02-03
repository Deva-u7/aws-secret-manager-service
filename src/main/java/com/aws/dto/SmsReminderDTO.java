package com.aws.dto;

import lombok.*;

import java.time.ZonedDateTime;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class SmsReminderDTO {
        Long id;
        String customerNumber;
        String accountNumber;
        String msisdn;
        Boolean isWeekly;
        String frequency;
        String message;
        String messageId;
        String createdBy;
        String lastModifiedBy;
        ZonedDateTime createdDate;
        ZonedDateTime lastModifiedDate;
}
