package com.randevudefterim.shopservice.entity;
import com.randevudefterim.shopservice.core.entity.BaseEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointments")

public class Appointment extends BaseEntity {

    @Column(name = "customer_first_name")
    private String customerFirstName;
    @Column(name = "customer_last_name")
    private String customerLastName;
    @Column(name = "customer_phone_number",nullable = true)
    private String phoneNumber;
    @Column(name = "customer_email",nullable = true)
    private String email;
    @Column(name = "customer_appointment_date")
    private LocalDateTime appointmentDate;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
