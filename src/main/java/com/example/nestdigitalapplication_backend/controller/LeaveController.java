package com.example.nestdigitalapplication_backend.controller;


import com.example.nestdigitalapplication_backend.dao.LeaveApplicationDao;
import com.example.nestdigitalapplication_backend.model.Leaveapplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class LeaveController {
    @Autowired
    private LeaveApplicationDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/leaveapply",produces = "application/json",consumes = "application/json")
    public Map<String,String> ApplyLeave(@RequestBody Leaveapplication l)
    {
        System.out.println(l.getEmpid());
        System.out.println(l.getLeavetype().toString());
        System.out.println(l.getRemarks().toString());
        System.out.println(l.getFromdate().toString());
        System.out.println(l.getTodate().toString());
        System.out.println(l.getLeaveapplydate().toString());
        System.out.println(l.getStatus().toString());
        dao.save(l);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewallleavebyemp")
    public List<Map<String,String>> ViewAllLeave()
    {
        return (List<Map<String, String>>) dao.ViewAllLeave();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/update",consumes = "application/json",produces = "application/json")
    public Map<String,String> UpdateStatus(@RequestBody Leaveapplication l)
    {
        String empid=String.valueOf(l.getEmpid());
        String status=l.getStatus().toString();
        System.out.println(empid);
        System.out.println(status);
        dao.UpdateStatus(l.getEmpid(),l.getStatus());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }




}






