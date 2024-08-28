package com.randevudefterim.notificationservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "customerInfo")
public class Appointment {

    @Id
    private String id;
    private String customerFirstName;
    private String customerLastName;
    private String phoneNumber;
    private String email;
    private LocalDateTime appointmentDate;
}
