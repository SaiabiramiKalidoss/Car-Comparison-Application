package main.java.com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.repository.model.CarInformation;

public interface CustomLoginRepository extends MongoRepository<CarInformation, String> {
    void deleteByName(String name);
    @Query("{ 'name' : ?0 }")
    Optional<CarInformation> findByName(String name);
}
