package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.model.FilterCriteria;
import com.example.demo.service.FilterCriteriaService;

@RestController

@RequestMapping("/filtercriteria")

public class FilterCriteriaController {


    @Autowired
    FilterCriteriaService filtercriteriaservice;


    @PostMapping("/post-filtercriteria-details")
    public void savemployeedata(@RequestBody FilterCriteria filtercriteria) {
        filtercriteriaservice.savefilterCriteriadata(filtercriteria);
    }

    @GetMapping("/get-filtercriteria-details")
    public List<FilterCriteria> getAllfiltercriteria() {
        return filtercriteriaservice.getAllfilterCriteria();
    }


}
