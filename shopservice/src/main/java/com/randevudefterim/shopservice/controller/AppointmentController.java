package com.randevudefterim.shopservice.controller;

import com.randevudefterim.shopservice.core.dto.request.appointment.CreateAppointmentRequest;
import com.randevudefterim.shopservice.core.dto.request.appointment.UpdateAppointmentRequest;
import com.randevudefterim.shopservice.core.dto.response.appointment.*;
import com.randevudefterim.shopservice.entity.Appointment;
import com.randevudefterim.shopservice.service.abstracts.appointment.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }
    @GetMapping("/findById/{id}")
    public Optional<GetByIdAppointmentResponse> findById(@PathVariable int id)
    {
        return appointmentService.getAppointmentById(id);
    }
    @GetMapping("/listAppointment")
    public List<GetAllAppointmentResponse> getAllAppointmentResponseList()
    {
        return appointmentService.getAllAppointment();
    }
    @GetMapping("/listAppointmentWithOwner/{ownerId}")
    public List<GetAppointmentWithOwner> getAlllistAppointmentWithOwner(@PathVariable int ownerId)
    {
        return appointmentService.appointmentWithOwnerList(ownerId);
    }
    @DeleteMapping("/deleteAppointment/{id}")
    public void deleteAppointment(@PathVariable int id)
    {
        appointmentService.deleteAppointment(id);
    }
    @PostMapping("/createAppointment")
    public CreateAppointmentResponse createAppointment(@RequestBody CreateAppointmentRequest request)
    {
        return appointmentService.createAppointment(request);
    }
    @PutMapping("/updateAppointment/{id}")
    public UpdateAppointmentResponse updateAppointment(@PathVariable int id, @RequestBody UpdateAppointmentRequest request)
    {
        return appointmentService.updateAppointment(request,id);
    }
}
