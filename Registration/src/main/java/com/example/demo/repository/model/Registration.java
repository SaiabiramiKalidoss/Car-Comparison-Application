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
    private String Name;
    private String MailId;
    private String Password;
    private String MobileNumber;

}