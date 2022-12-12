package com.example.nestdigitalapplication_backend.dao;

import com.example.nestdigitalapplication_backend.model.Leaveapplication;
import org.springframework.data.repository.CrudRepository;

public interface LeaveApplicationDao extends CrudRepository<Leaveapplication,Integer> {
}
