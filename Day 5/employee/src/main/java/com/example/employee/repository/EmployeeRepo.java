package com.example.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.employee.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
   
}
