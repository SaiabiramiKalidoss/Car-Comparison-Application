package com.example.demo.repository.model;

import lombok.Data;

//@Document(collection = "carInformation")
@Data public class CarInformation {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Brand;
    private String Price;
    private String Rating;
    private String Mileage;
    private String FuelType;
    private String VehicleType;
    private String VehicleAvailability;

}
