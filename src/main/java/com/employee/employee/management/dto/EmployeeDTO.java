package com.employee.employee.management.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String position;
    private String phone;
    private Double salary;
    private Long departmentId;
    private String departmentName;
}
