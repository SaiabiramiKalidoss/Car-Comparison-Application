package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.LoginRepository;
import com.example.demo.repository.model.Logindata;
import com.example.demo.service.LoginService;

@RestController

@RequestMapping("/login")

public class LoginController {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    LoginService loginService;

    @Autowired
    LoginRepository loginRepository;


    @PostMapping("/post-login-details")
    public void savelogindata(@RequestBody Logindata logindata) {
        loginService.savelogindata(logindata);
    }

    @GetMapping("/get-login-details")
    public List<Logindata> getAlllogindata() {
        return loginService.getAlllogindata();
    }

    @DeleteMapping("/delete/")
    public String deleteLogindataByName(@RequestParam String name) {
        loginService.deleteLogindataByName(name);
        return "Deleted Successfully";
    }

    @PutMapping("/updateByName/{name}")
    public Logindata updateLogindataByName(@PathVariable String name, @RequestBody Logindata updatedLogindata) {
        return loginService.updateLogindataByName(name, updatedLogindata);
    }


}


