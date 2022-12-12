package com.example.nestdigitalapplication_backend.dao;

import com.example.nestdigitalapplication_backend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value = "SELECT `id`, `address`, `company`, `confirm`, `designation`, `empcode`, `empname`, `mobno`, `password`, `salary`, `username` FROM `employee` WHERE `empcode`=:empcode",nativeQuery = true)
    List<Employee> SearchEmployee(@Param("empcode") Integer empcode);




}
