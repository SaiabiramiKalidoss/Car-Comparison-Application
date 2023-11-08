package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.model.CarInformation;
import com.example.demo.service.CarInformationService;

// @Api(
//     name = "employeeApi",
//     version = "v1",
//     description = "API for managing employees"
// )

@RestController

@RequestMapping("/carinformation")

public class CarInformationController {

    @Autowired
    MongoTemplate mongoTemplate;
    //private final EmployeeRepository employeeRepository;
    @Autowired
    CarInformationService carinformationservice;


    @PostMapping("/post-carinformation-details")
    public void savemployeedata(@RequestBody CarInformation carInformation) {
        carinformationservice.savecarInformationdata(carInformation);
    }

    @GetMapping("/get-carinformation-details")
    public List<CarInformation> getAllcarInformation() {
        return carinformationservice.getAllcarInformation();
    }


    // @GetMapping("/database-info")
    // public String getDatabaseInfo() {
    //     String databaseName = mongoTemplate.getDb().getName();
    //     return "Connected to MongoDB database: " + databaseName;
    // }
}
