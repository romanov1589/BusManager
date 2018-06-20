package com.romanov.BusManager.controller;

import com.romanov.BusManager.model.inheritance.Employee;
import com.romanov.BusManager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }
}
