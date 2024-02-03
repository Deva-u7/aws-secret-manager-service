package com.aws.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;


@Table(name = "sms_reminder_details")
@Entity
@Data
public class SmsReminderEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
        @SequenceGenerator(name = "sequenceGenerator")
        Long id;
        @Column(name = "customer_number")
        String customerNumber;
        @Column(name = "account_number")
        String accountNumber;
        @Column(name = "msisdn")
        String msisdn;
        @Column(name = "is_weekly")
        Boolean isWeekly;
        @Column(name = "frequency")
        String frequency;
        @Column(name = "message")
        String message;
        @Column(name = "message_id")
        String messageId;
        @Column(name = "created_by")
        String createdBy;
        @Column(name = "last_modified_by")
        String lastModifiedBy;
        @Column(name = "created_date")
        ZonedDateTime createdDate;
        @Column(name = "last_modified_date")
        ZonedDateTime lastModifiedDate;

}
