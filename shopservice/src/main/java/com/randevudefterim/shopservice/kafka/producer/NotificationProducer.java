package com.randevudefterim.shopservice.kafka.producer;

import com.randevudefterim.shopservice.core.dto.request.appointment.CreateAppointmentRequest;
import com.randevudefterim.shopservice.core.dto.request.appointment.UpdateAppointmentRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class NotificationProducer {

    private final KafkaTemplate<String, CreateAppointmentRequest> createAppointmentRequestKafkaTemplate;
    private final KafkaTemplate<String, UpdateAppointmentRequest> updateAppointmentRequestKafkaTemplate;

    @Value("${spring.kafka.template.default-topic}")
    private String CREATETOPIC;

    @Value("${spring.kafka.template.update-topic}")
    private String UPDATETOPIC;

    public NotificationProducer(KafkaTemplate<String, CreateAppointmentRequest> createAppointmentRequestKafkaTemplate, KafkaTemplate<String, UpdateAppointmentRequest> updateAppointmentRequestKafkaTemplate) {
        this.createAppointmentRequestKafkaTemplate = createAppointmentRequestKafkaTemplate;
        this.updateAppointmentRequestKafkaTemplate = updateAppointmentRequestKafkaTemplate;
    }


    public void createAppointmentMessage(CreateAppointmentRequest message) {
        createAppointmentRequestKafkaTemplate.send(CREATETOPIC, message);
        System.out.println("Rezervasyon Oluşturuldu : " + message);
    }
    public void updateAppointMessage(UpdateAppointmentRequest message) {
        updateAppointmentRequestKafkaTemplate.send(UPDATETOPIC, message);
        System.out.println("Rezervasyon Güncellendi : " + message);
    }
}