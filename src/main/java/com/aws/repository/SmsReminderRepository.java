package com.aws.repository;


import com.aws.entity.SmsReminderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SmsReminderRepository extends JpaRepository<SmsReminderEntity, Long> {

}
