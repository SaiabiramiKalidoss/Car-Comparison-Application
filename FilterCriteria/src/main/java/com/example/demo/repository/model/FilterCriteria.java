package com.example.demo.repository.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//@Document(collection = "filterCriteria")
@Data public class FilterCriteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CarPrice;
    private String Brand;
    private String CustomerRating;
    private String VehicleType;

}
