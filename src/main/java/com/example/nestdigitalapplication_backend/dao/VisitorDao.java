package com.example.nestdigitalapplication_backend.dao;

import com.example.nestdigitalapplication_backend.model.Visitorlog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.servlet.function.RouterFunctions;

public interface VisitorDao extends CrudRepository<Visitorlog,Integer> {
}
