package com.employee.employee.management.service;

import com.employee.employee.management.entity.Department;
import com.employee.employee.management.repository.DepartmentRepository;
import com.employee.employee.management.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class DepartmentService {


    private final DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        if (departmentRepository.existsByName(department.getName())) {
            throw new RuntimeException("Department already exists!");
        }
        return departmentRepository.save(department);
    }
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found!"));
    }
    public Department updateDepartment(Long id, Department department) {
        Department existing = getDepartmentById(id);
        existing.setName(department.getName());
        return departmentRepository.save(existing);
    }
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }

}
