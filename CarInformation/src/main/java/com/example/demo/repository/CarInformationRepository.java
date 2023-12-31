package com.example.demo.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.CarInformation;

import main.java.com.example.demo.repository.CustomLoginRepository;

@Repository
@Qualifier("mongoEmployeeRepository")
public interface CarInformationRepository extends MongoRepository<CarInformation, String>, CustomLoginRepository {

    Optional<CarInformation> findByName(String name);

}