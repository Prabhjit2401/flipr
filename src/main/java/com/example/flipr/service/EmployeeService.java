package com.example.flipr.service;

import com.example.flipr.model.Employee;

import java.util.Optional;

public interface EmployeeService {

    Optional<Employee> getProfile(Integer id);
    void addTask();
}
