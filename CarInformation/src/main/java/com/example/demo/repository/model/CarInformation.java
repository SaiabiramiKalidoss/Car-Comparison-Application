package com.example.demo.repository.model;

import jakarta.persistence.Id;
import lombok.Data;

//@Document(collection = "carInformation")
@Data public class CarInformation {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String brand;
    private String price;
    private String rating;
    private String mileage;
    private String fuelType;
    private String vehicleType;
    private String vehicleAvailability;

}
