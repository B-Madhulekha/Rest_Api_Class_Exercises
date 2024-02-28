package com.example.employee.service;

import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepo;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee updateEmployee(int employeeId, Employee employee) {
        if (employeeRepo.existsById(employeeId)) {
            employee.setEmployeeId(employeeId);
            return employeeRepo.save(employee);
        } else {
            return null;
        }
    }

    public boolean deleteEmployee(int employeeId) {
        if (employeeRepo.existsById(employeeId)) {
            employeeRepo.deleteById(employeeId);
            return true;
        } else {
            return false;
        }
    }
}

