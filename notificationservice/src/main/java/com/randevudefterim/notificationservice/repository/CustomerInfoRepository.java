package com.randevudefterim.notificationservice.repository;

import com.randevudefterim.notificationservice.entity.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerInfoRepository extends MongoRepository<Appointment, String> {
}
