package com.randevudefterim.shopservice.service.concretes.appointment;

import com.randevudefterim.shopservice.core.dto.request.appointment.CreateAppointmentRequest;
import com.randevudefterim.shopservice.core.dto.request.appointment.UpdateAppointmentRequest;
import com.randevudefterim.shopservice.core.dto.response.appointment.*;
import com.randevudefterim.shopservice.core.mapper.AppointmentMapper;
import com.randevudefterim.shopservice.entity.Appointment;
import com.randevudefterim.shopservice.kafka.producer.NotificationProducer;
import com.randevudefterim.shopservice.repository.AppointmentRepository;
import com.randevudefterim.shopservice.service.abstracts.appointment.AppointmentService;
import org.springframework.stereotype.Service;
import org.turkcell.tcell.exception.exceptions.type.BaseBusinessException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final NotificationProducer notificationProducer;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository, NotificationProducer notificationProducer) {
        this.appointmentRepository = appointmentRepository;
        this.notificationProducer = notificationProducer;
    }

    @Override
    public void deleteAppointment(int id) {
        appointmentRepository.deleteById(id);
    }

    @Override
    public CreateAppointmentResponse createAppointment(CreateAppointmentRequest request) {
        List<Appointment> existingAppointments = appointmentRepository.findByOwnerIdAndAppointmentDate(
                request.getOwnerId(), request.getAppointmentDate());

        if (!existingAppointments.isEmpty()) {
            throw new BaseBusinessException("Bu saat ve tarihte zaten bir randevu var.");
        }

        Appointment appointment = AppointmentMapper.INSTANCE.createAppointmentMapper(request);

        notificationProducer.createAppointmentMessage(request);

        Appointment savedAppointment = appointmentRepository.save(appointment);

        return new CreateAppointmentResponse(
                savedAppointment.getId(),
                savedAppointment.getCustomerFirstName(),
                savedAppointment.getCustomerLastName(),
                savedAppointment.getPhoneNumber(),
                savedAppointment.getEmail(),
                savedAppointment.getAppointmentDate(),
                savedAppointment.getOwner().getId()
        );
    }

    @Override
    public UpdateAppointmentResponse updateAppointment(UpdateAppointmentRequest request, int id) {
        Optional<Appointment> optionalAppointment = appointmentRepository.findById(id);
        Appointment existingAppointment = optionalAppointment.get();
        Appointment appointment = AppointmentMapper.INSTANCE.updateAppointmentMapper(request,existingAppointment);
        notificationProducer.updateAppointMessage(request);
        Appointment savedAppointment = appointmentRepository.save(appointment);
        return new UpdateAppointmentResponse(
                appointment.getId(),
                appointment.getCustomerFirstName(),
                appointment.getCustomerLastName(),
                appointment.getPhoneNumber(),
                appointment.getEmail(),
                appointment.getAppointmentDate(),
                appointment.getOwner().getId()
        );
    }

    @Override
    public List<GetAllAppointmentResponse> getAllAppointment() {
        List<Appointment> appointments = appointmentRepository.findAll();
        return AppointmentMapper.INSTANCE.GetAllAppointmentResponse(appointments);
    }

    @Override
    public Optional<GetByIdAppointmentResponse> getAppointmentById(int id) {
        Optional<Appointment> optionalAppointment = appointmentRepository.findById(id);
        return optionalAppointment.map(AppointmentMapper.INSTANCE::getByIdAppointmentResponse);
    }

    @Override
    public List<GetAppointmentWithOwner> appointmentWithOwnerList(int id) {
        List<Appointment> appointments = appointmentRepository.findByOwnerId(id);

        return appointments.stream()
                .map(AppointmentMapper.INSTANCE::getAppointmentWithOwner)
                .collect(Collectors.toList());
    }
}
