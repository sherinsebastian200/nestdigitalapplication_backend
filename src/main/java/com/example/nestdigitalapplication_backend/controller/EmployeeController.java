package com.example.nestdigitalapplication_backend.controller;


import com.example.nestdigitalapplication_backend.dao.EmployeeDao;
import com.example.nestdigitalapplication_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @CrossOrigin (origins = "*")
    @PostMapping(path = "/addemploy", consumes = "application/json", produces = "application/json")
    public Map<String,String>AddEmploy(@RequestBody Employee e){
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getEmpcode());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());

        dao.save(e);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchemploy", consumes = "application/json", produces = "application/json")
    public List<Employee> SearchEmployee(@RequestBody Employee e)
    {
        String empcode=String.valueOf(e.getEmpcode());
        System.out.println(empcode);
        return (List<Employee>) dao.SearchEmployee(e.getEmpcode());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deleteemploy",consumes = "application/json",produces = "application/json")
    public Map<String,String> DeleteEmployee(@RequestBody Employee e)
    {
        String id=String.valueOf(e.getId());
        System.out.println(id);
        dao.DeleteEmployee(e.getId());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employlogin" ,consumes = "application/json",produces = "application/json")
    public Map<String,String> EmployLogin(@RequestBody Employee e)
    {
        String username=e.getUsername().toString();
        String password=e.getPassword().toString();
        System.out.println(username);
        System.out.println(password);
        List<Employee> result=(List<Employee>) dao.EmployLogin(e.getUsername(),e.getPassword());
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



}
