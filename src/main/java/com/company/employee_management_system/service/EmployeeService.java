package com.company.employee_management_system.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.company.employee_management_system.entity.employee;
import com.company.employee_management_system.repository.repository;

@Service
public class EmployeeService {

    private repository repository;

    // Constructor Injection
    public EmployeeService(repository repository) {
        this.repository = repository;
    }

    // Add Employee
    public employee addEmployee(employee employee) {
        return repository.save(employee);
    }

    // Get All Employees
    public List<employee> getAllEmployees() {
        return repository.findAll();
    }
}
