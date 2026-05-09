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
        // Get Employee By ID
    public employee getEmployeeById(Long id) {

        return repository.findById(id).orElse(null);
    }
// Update Employee
public employee updateEmployee(Long id, employee updatedEmployee) {

    employee existingEmployee = repository.findById(id).orElse(null);

    if (existingEmployee != null) {

        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setEmail(updatedEmployee.getEmail());
        existingEmployee.setDepartment(updatedEmployee.getDepartment());
        existingEmployee.setSalary(updatedEmployee.getSalary());

        return repository.save(existingEmployee);
    }

    return null;
}
    

}
