package com.example.demo.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Logindata;

import main.java.com.example.demo.repository.CustomLoginRepository;

@Repository
@Qualifier("mongoEmployeeRepository")
public interface LoginRepository extends MongoRepository<Logindata, String>, CustomLoginRepository {

    Optional<Logindata> findByName(String name);

}