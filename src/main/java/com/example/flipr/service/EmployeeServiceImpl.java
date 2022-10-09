package com.example.flipr.service;

import com.example.flipr.model.Employee;
import com.example.flipr.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    EmployeeRepo employeeRepo;

    @Override
    public Optional<Employee> getProfile(Integer id) {
        return employeeRepo.findById(id);
    }

    @Override
    public void addTask() {
        
    }
}
