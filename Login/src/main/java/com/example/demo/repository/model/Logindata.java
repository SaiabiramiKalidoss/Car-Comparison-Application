package com.example.demo.repository.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Document(collection = "logindata")
@Data public class Logindata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Name;
    private String Password;

}
