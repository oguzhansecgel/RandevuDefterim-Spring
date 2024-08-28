package com.randevudefterim.shopservice.service.abstracts.appointment;

import com.randevudefterim.shopservice.core.dto.request.appointment.CreateAppointmentRequest;
import com.randevudefterim.shopservice.core.dto.request.appointment.UpdateAppointmentRequest;
import com.randevudefterim.shopservice.core.dto.response.appointment.*;
import com.randevudefterim.shopservice.entity.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {

    void deleteAppointment(int id);
    CreateAppointmentResponse createAppointment(CreateAppointmentRequest request);
    UpdateAppointmentResponse updateAppointment(UpdateAppointmentRequest request, int id);
    List<GetAllAppointmentResponse> getAllAppointment();
    Optional<GetByIdAppointmentResponse> getAppointmentById(int id);

    List<GetAppointmentWithOwner> appointmentWithOwnerList(int id);
}
