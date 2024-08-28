package com.randevudefterim.notificationservice.service.abstracts;

import com.randevudefterim.notificationservice.entity.Appointment;

public interface CustomerInfoService {

    void sendToCustomerAppointment(Appointment appointment);
}
