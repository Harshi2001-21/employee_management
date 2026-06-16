package com.employee.employee.management.service;

import com.employee.employee.management.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.employee.employee.management.repository.EmployeeRepository;
import com.employee.employee.management.exception.ResourceNotFoundException;

import java.util.List;

@Service
@RequiredArgsConstructor

public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employee) {
        if (employeeRepository.existsByEmail(employee.getEmail())) {
            throw new RuntimeException("Email already exists!");
        }
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found!"));
    }
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = getEmployeeById(id);
        existing.setFirstName(employee.getFirstName());
        existing.setLastName(employee.getLastName());
        existing.setEmail(employee.getEmail());
        existing.setPhone(employee.getPhone());
        existing.setPosition(employee.getPosition());
        existing.setSalary(employee.getSalary());
        existing.setDepartment(employee.getDepartment());
        return employeeRepository.save(existing);
    }
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}