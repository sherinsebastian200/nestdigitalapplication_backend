package com.example.nestdigitalapplication_backend.dao;

import com.example.nestdigitalapplication_backend.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value = "SELECT `id`, `designation`, `empcode`, `empname`, `password`, `salary`, `username` FROM `employees` WHERE `empcode`=:empcode",nativeQuery = true)
    List<Employee> SearchEmployee(@Param("empcode") Integer empcode);


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employees` WHERE `id`=:id",nativeQuery = true)
    void DeleteEmployee(@Param("id")Integer id);

    @Query(value = "SELECT `id`, `designation`, `empcode`, `empname`, `password`, `salary`, `username` FROM `employees` WHERE `username`=:username AND `password`=:password",nativeQuery = true)
    List<Employee> EmployLogin(@Param("username") String username,@Param("password") String password);


    @Query(value = "SELECT `id`, `designation`, `empcode`, `empname`, `password`, `salary`, `username` FROM `employees` WHERE `id`=:id",nativeQuery = true)

    List<Employee> EmpViewByID(@Param("id") Integer id);





}
