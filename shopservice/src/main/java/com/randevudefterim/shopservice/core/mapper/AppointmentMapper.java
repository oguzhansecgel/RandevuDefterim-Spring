package com.randevudefterim.shopservice.core.mapper;

import com.randevudefterim.shopservice.core.dto.request.appointment.CreateAppointmentRequest;
import com.randevudefterim.shopservice.core.dto.request.appointment.UpdateAppointmentRequest;
import com.randevudefterim.shopservice.core.dto.response.appointment.GetAllAppointmentResponse;
import com.randevudefterim.shopservice.core.dto.response.appointment.GetAppointmentWithOwner;
import com.randevudefterim.shopservice.core.dto.response.appointment.GetByIdAppointmentResponse;
import com.randevudefterim.shopservice.entity.Appointment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AppointmentMapper {

    AppointmentMapper INSTANCE = Mappers.getMapper(AppointmentMapper.class);

    @Mapping(source = "ownerId",target = "owner.id")
    Appointment createAppointmentMapper(CreateAppointmentRequest request);

    @Mapping(source = "ownerId",target = "owner.id")
    Appointment updateAppointmentMapper(UpdateAppointmentRequest appointmentRequest, @MappingTarget Appointment appointment);

    @Mapping(source = "owner.id",target = "ownerId")
    GetByIdAppointmentResponse getByIdAppointmentResponse(Appointment appointment);

    @Mapping(source = "owner.id",target = "ownerId")
    GetAllAppointmentResponse getAllAppointmentResponse(Appointment appointment);
    List<GetAllAppointmentResponse> GetAllAppointmentResponse(List<Appointment> appointment);


    @Mapping(source = "owner.id", target = "ownerId")
    GetAppointmentWithOwner getAppointmentWithOwner(Appointment appointment);
}
