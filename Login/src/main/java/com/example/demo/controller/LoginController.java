package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.model.Logindata;
import com.example.demo.service.LoginService;

@RestController

@RequestMapping("/login")

public class LoginController {

    @Autowired
    MongoTemplate mongoTemplate;
    //private final EmployeeRepository employeeRepository;
    @Autowired
    LoginService loginService;


    @PostMapping("/post-login-details")
    public void savelogindata(@RequestBody Logindata logindata) {
        loginService.savelogindata(logindata);
    }

    @GetMapping("/get-login-details")
    public List<Logindata> getAlllogindata() {
        return loginService.getAlllogindata();
    }


    // @GetMapping("/database-info")
    // public String getDatabaseInfo() {
    //     String databaseName = mongoTemplate.getDb().getName();
    //     return "Connected to MongoDB database: " + databaseName;
    // }
}
