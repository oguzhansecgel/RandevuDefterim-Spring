package com.randevudefterim.shopservice.core.dto.response.appointment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdAppointmentResponse {
    private int id;
    private String customerFirstName;
    private String customerLastName;
    private String phoneNumber;
    private String email;
    private LocalDateTime appointmentDate;
    private int ownerId;
}
