package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.FilterCriteriaRepository;
import com.example.demo.repository.model.FilterCriteria;

@Service
public class FilterCriteriaService {

    @Autowired
    FilterCriteriaRepository filterCriteriaRepository;
    
    
    public void savefilterCriteriadata(FilterCriteria filterCriteria) {
        filterCriteriaRepository.save(filterCriteria);
    }


    public List<FilterCriteria> getAllfilterCriteria() {
        return (List<FilterCriteria>) filterCriteriaRepository.findAll();
    }



    // public Employee updateEmployee(Long id, Employee updatedEmployee) {
    //     // Check if the employee exists
    //     if (!loginRepositorysitory.existsById(id)) {
    //         // Handle not found scenario
    //         throw new EmployeeNotFoundException("Employee with ID " + id + " not found");
    //     }
        
    //     // Set the ID of the updated employee to match the existing record
    //     updatedEmployee.setId(id);
    //     return loginRepositorysitory.save(updatedEmployee);
    // }

    // public void deleteEmployee(Long id) {
    //     if (!loginRepositorysitory.existsById(id)) {
    //         // Handle not found scenario
    //         throw new EmployeeNotFoundException("Employee with ID " + id + " not found");
    //     }
    //     loginRepositorysitory.deleteById(id);
    // }
}
