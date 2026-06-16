package com.employee.employee.management.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String position;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private Double salary;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
