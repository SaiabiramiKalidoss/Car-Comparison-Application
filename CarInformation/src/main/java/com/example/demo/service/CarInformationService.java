package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ResourceNotFoundException;
import com.example.demo.repository.CarInformationRepository;
import com.example.demo.repository.model.CarInformation;

@Service
public class CarInformationService {

    @Autowired
    CarInformationRepository carInformationRepository;

    
    
     public void savecarInformationdata(CarInformation carInformation) {
        carInformationRepository.save(carInformation);
    }


    public List<CarInformation> getAllcarInformation() {
        return (List<CarInformation>) carInformationRepository.findAll();
    }

     public void deletedataByName(String name) {
        carInformationRepository.deleteByName(name);
    }


        public CarInformation updatedataByName(String name, CarInformation updateddata) {

        Optional<CarInformation> existingdataOptional = carInformationRepository.findByName(name);
        if (existingdataOptional.isPresent()) {
            CarInformation existingLogindata = existingdataOptional.get();


        existingLogindata.setBrand(updateddata.getBrand());
        existingLogindata.setPrice(updateddata.getPrice());
        existingLogindata.setRating(updateddata.getRating());
        existingLogindata.setMileage(updateddata.getMileage());
        existingLogindata.setFuelType(updateddata.getFuelType());
        existingLogindata.setVehicleType(updateddata.getVehicleType());
        existingLogindata.setVehicleAvailability(updateddata.getVehicleAvailability());
            return carInformationRepository.save(existingLogindata);

    }
    else{
    throw new ResourceNotFoundException("Login data not found with Brand: " + name);
        }
    }

}
