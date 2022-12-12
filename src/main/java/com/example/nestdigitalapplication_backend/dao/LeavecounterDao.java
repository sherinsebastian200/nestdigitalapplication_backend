package com.example.nestdigitalapplication_backend.dao;

import com.example.nestdigitalapplication_backend.model.Leavecount;
import org.springframework.data.repository.CrudRepository;

public interface LeavecounterDao extends CrudRepository<Leavecount,Integer> {


}
