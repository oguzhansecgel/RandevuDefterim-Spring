package com.randevudefterim.shopservice.repository;

import com.randevudefterim.shopservice.core.dto.response.appointment.GetAppointmentWithOwner;
import com.randevudefterim.shopservice.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
    List<Appointment> findByOwnerId(int ownerId);
    List<Appointment> findByOwnerIdAndAppointmentDate(int ownerId, LocalDateTime appointmentDate);
}
