package com.example.demo.repository.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//@Document(collection = "filterCriteria")
@Data public class FilterCriteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String carPrice;
    private String brand;
    private String customerRating;
    private String vehicleType;

}
