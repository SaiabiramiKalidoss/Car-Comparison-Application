package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.model.Registration;
import com.example.demo.service.RegistrationService;

@RestController

@RequestMapping("/registration")

public class RegistrationController {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    RegistrationService registrationService;

    @GetMapping("/get-registration-details")
    public List<Registration> getAllregistration() {
        return registrationService.getAllregistration();
    }

    @PostMapping("/post-registration-details")
    public void saveregistrationdata(@RequestBody Registration registration) {
        registrationService.saveregistrationdata(registration);
    }

    // @GetMapping("/database-info")
    // public String getDatabaseInfo() {
    //     String databaseName = mongoTemplate.getDb().getName();
    //     return "Connected to MongoDB database: " + databaseName;
    // }
}
