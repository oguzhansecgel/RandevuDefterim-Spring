package com.randevudefterim.notificationservice.kafka.consumer;

import com.randevudefterim.notificationservice.entity.Appointment;
import com.randevudefterim.notificationservice.service.abstracts.CustomerInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ShopConsumer {

    private final CustomerInfoService customerInfoService;

    @KafkaListener(topics = "${spring.kafka.template.default-topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void createConsumer(ConsumerRecord<String, Appointment> payload) {
        customerInfoService.sendToCustomerAppointment(payload.value());
        System.out.println("Consumer tarafından mesaj alındı  : " + payload.value());
    }

    @KafkaListener(topics = "${spring.kafka.template.update-topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void updateConsumer(ConsumerRecord<String, Appointment> payload) {
        customerInfoService.updateToCustomerAppointment(payload.value());
        System.out.println("Consumer güncelleme mesajı alındı  : " + payload.value());
    }


}
