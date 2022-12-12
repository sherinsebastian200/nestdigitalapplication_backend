package com.example.nestdigitalapplication_backend.dao;

import com.example.nestdigitalapplication_backend.model.Security;
import org.springframework.data.repository.CrudRepository;

public interface SecurityDao extends CrudRepository<Security,Integer> {
}
