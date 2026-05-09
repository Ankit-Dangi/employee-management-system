package com.company.employee_management_system.controller;



import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.employee_management_system.entity.employee;
import com.company.employee_management_system.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService service;

    // Constructor Injection
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // Add Employee API
    @PostMapping
    public employee addEmployee(@RequestBody employee employee) {
        return service.addEmployee(employee);
    }

    // Get All Employees API
    @GetMapping
    public List<employee> getAllEmployees() {
        return service.getAllEmployees();
    }
@GetMapping("/{id}")
public employee getEmployeeById(@PathVariable Long id) {

    return service.getEmployeeById(id);
}
   
}
