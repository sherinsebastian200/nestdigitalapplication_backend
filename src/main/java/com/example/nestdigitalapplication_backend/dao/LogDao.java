package com.example.nestdigitalapplication_backend.dao;

import com.example.nestdigitalapplication_backend.model.Employeelog;
import org.springframework.data.repository.CrudRepository;

public interface LogDao extends CrudRepository<Employeelog,Integer> {


}
