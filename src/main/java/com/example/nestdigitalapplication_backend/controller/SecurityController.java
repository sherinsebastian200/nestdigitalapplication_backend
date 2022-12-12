package com.example.nestdigitalapplication_backend.controller;

import com.example.nestdigitalapplication_backend.dao.EmployeeDao;
import com.example.nestdigitalapplication_backend.dao.SecurityDao;
import com.example.nestdigitalapplication_backend.model.Employee;
import com.example.nestdigitalapplication_backend.model.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class SecurityController {
    @Autowired
    private SecurityDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addsecurity", consumes = "application/json", produces = "application/json")
    public Map<String,String> AddSecurity(@RequestBody Security s){
        System.out.println(s.getSecname().toString());
        System.out.println(s.getEmpcode());

        System.out.println(s.getUsername().toString());
        System.out.println(s.getPassword().toString());

        dao.save(s);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }




}
