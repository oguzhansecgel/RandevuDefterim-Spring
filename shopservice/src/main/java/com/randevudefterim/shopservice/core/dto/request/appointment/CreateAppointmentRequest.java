package com.randevudefterim.shopservice.core.dto.request.appointment;

import com.randevudefterim.shopservice.entity.Owner;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAppointmentRequest {

    private String customerFirstName;
    private String customerLastName;
    private String phoneNumber;
    private String email;
    private LocalDateTime appointmentDate;
    private int ownerId;
}
