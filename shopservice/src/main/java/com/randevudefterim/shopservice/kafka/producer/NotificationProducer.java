package com.randevudefterim.shopservice.kafka.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class NotificationProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Value("${spring.kafka.template.default-topic}")
    private String CREATETOPIC;


    public NotificationProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void createAppointmentMessage(Object message) {
        kafkaTemplate.send(CREATETOPIC,message);
        System.out.println("Rezervasyon Oluşturuldu :  " + message);
    }


}
