package com.company.employee_management_system.repository;



import com.company.employee_management_system.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<employee, Long> {

}
