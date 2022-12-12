package com.example.nestdigitalapplication_backend.controller;

import com.example.nestdigitalapplication_backend.dao.EmployeeDao;
import com.example.nestdigitalapplication_backend.dao.LogDao;
import com.example.nestdigitalapplication_backend.model.Employeelog;
import com.example.nestdigitalapplication_backend.model.Visitorlog;
import com.sun.jdi.PrimitiveValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class LogController {
    @Autowired
    private LogDaoC dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employlog", consumes = "application/json", produces = "application/json")
    public Map<String,String>EmployLog(@RequestBody Employeelog l){
        System.out.println(l.getEmpid());
        System.out.println(l.getDate().toString());
        System.out.println(l.getEntrydatetime().toString());
        System.out.println(l.getExitdatetime().toString());
        dao.save(l);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/visitorlog", consumes = "application/json", produces = "application/json")
    public Map<String,String>VisitorLog(@RequestBody Visitorlog v){
        System.out.println(v.getName().toString());
        System.out.println(v.getPurpose().toString());
        System.out.println(v.getWhomtomeet().toString());
        System.out.println(v.getEntrydatetime().toString());
        System.out.println(v.getExitdatetime().toString());

        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

}
