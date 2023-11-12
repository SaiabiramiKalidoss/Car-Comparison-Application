package com.example.demo.repository.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;

@Document(collection = "logindata")
@Data
public class Logindata {
    @Id
    private String id;
    private String name;
    private String password;
}
