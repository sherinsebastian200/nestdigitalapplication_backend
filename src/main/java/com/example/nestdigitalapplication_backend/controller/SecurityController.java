package com.example.nestdigitalapplication_backend.controller;

import com.example.nestdigitalapplication_backend.dao.EmployeeDao;
import com.example.nestdigitalapplication_backend.dao.SecurityDao;
import com.example.nestdigitalapplication_backend.model.Employee;
import com.example.nestdigitalapplication_backend.model.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securitylogin" ,consumes = "application/json",produces = "application/json")
    public Map<String,String>SecurityLogin(@RequestBody Security s)
    {
        String username=s.getUsername().toString();
        String password=s.getPassword().toString();
        System.out.println(username);
        System.out.println(password);
        List<Security> result=(List<Security>) dao.SecurityLogin(s.getUsername(),s.getPassword());
        HashMap<String,String> map=new HashMap<>();
        if (result.size()==0)
        {
            map.put("status","failed");
        }
        else{
            int id=result.get(0).getId();
            map.put("empId",String.valueOf(id));
            map.put("status","success");
        }
        return map;





    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewsecurity")
    public List<Security> SecurityView()
    {
        return (List<Security>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securityprofile",consumes = "application/json",produces = "application/json")
    public List<Security> SecViewByID(@RequestBody Security s)
    {
        String id=String.valueOf(s.getId());
        System.out.println(id);
        return (List<Security>) dao.SecViewByID(s.getId());
    }








}
