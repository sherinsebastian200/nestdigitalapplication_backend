package com.example.nestdigitalapplication_backend.controller;


import com.example.nestdigitalapplication_backend.dao.LeaveApplicationDao;
import com.example.nestdigitalapplication_backend.model.Leaveapplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class LeaveController {
    @Autowired
    private LeaveApplicationDao dao;
    @PostMapping(path = "/leaveapply",produces = "application/json",consumes = "application/json")
    public Map<String,String> ApplyLeave(@RequestBody Leaveapplication l)
    {
        dao.save(l);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
}






