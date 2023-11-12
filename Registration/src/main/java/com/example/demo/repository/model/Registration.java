package com.example.demo.repository.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Document(collection = "Registration")
@Data public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String mailId;
    private String password;
    private String mobileNumber;

}