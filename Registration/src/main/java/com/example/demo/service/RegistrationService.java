package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.RegistrationRepository;
import com.example.demo.repository.model.Registration;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;
    
    
    public void saveregistrationdata(Registration registration) {
        registrationRepository.save(registration);
    }


    public List<Registration> getAllregistration() {
        return (List<Registration>) registrationRepository.findAll();
    }


}
