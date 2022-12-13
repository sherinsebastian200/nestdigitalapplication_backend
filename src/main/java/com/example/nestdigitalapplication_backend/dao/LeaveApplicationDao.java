package com.example.nestdigitalapplication_backend.dao;

import com.example.nestdigitalapplication_backend.model.Leaveapplication;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface LeaveApplicationDao extends CrudRepository<Leaveapplication,Integer> {


   @Query(value = "SELECT  e.`empcode`, e.`empname`,l.fromdate,l.leaveapplydate,l.leavetype,l.status,l.todate FROM `employees` e JOIN leaveapplicaitons l ON e.id = l.empid ",nativeQuery = true)
    List<Map<String,String>> ViewAllLeave();


    @Modifying
    @Transactional
    @Query(value = "UPDATE `leaveapplications` SET `status`= :status WHERE `empid`= :empid",nativeQuery = true)
    void UpdateStatus(@Param("empid") Integer empid, @Param("status") String status);



}
