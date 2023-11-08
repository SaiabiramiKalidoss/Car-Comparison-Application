package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Logindata;

@Repository
@Qualifier("mongoEmployeeRepository")
public interface LoginRepository extends MongoRepository<Logindata, Integer> {
}