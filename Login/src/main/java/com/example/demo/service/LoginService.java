package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.LoginRepository;
import com.example.demo.repository.model.Logindata;

import main.java.com.example.ResourceNotFoundException;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;
    
    
    public void savelogindata(Logindata logindata) {
        loginRepository.save(logindata);
    }


    public List<Logindata> getAlllogindata() {
        return (List<Logindata>) loginRepository.findAll();
    }

    public void deleteLogindataByName(String name) {
        loginRepository.deleteByName(name);
    }


        public Logindata updateLogindataByName(String name, Logindata updatedLogindata) {
        System.out.println("name: " + name);
        System.out.println("Logindata: " + updatedLogindata);
        Optional<Logindata> existingLogindataOptional = loginRepository.findByName(name);
        if (existingLogindataOptional.isPresent()) {
            Logindata existingLogindata = existingLogindataOptional.get();
            System.out.println("Existing Logindata: " + existingLogindata);

        //updatedLogindata.setLoginId(existingLogindata.getLoginId());

        existingLogindata.setName(updatedLogindata.getName());
        existingLogindata.setPassword(updatedLogindata.getPassword());
        System.out.println("Updated Logindata1: " + existingLogindata);
            return loginRepository.save(existingLogindata);

    }
    else{
    throw new ResourceNotFoundException("Login data not found with name: " + name);
        }
    }


}
