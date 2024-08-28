package com.randevudefterim.shopservice.core.dto.request.appointment;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAppointmentRequest {

    private String customerFirstName;
    private String customerLastName;
    private String phoneNumber;
    private String email;
    private LocalDateTime appointmentDate;
    private int ownerId;
}
