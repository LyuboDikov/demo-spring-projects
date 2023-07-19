package com.example.mvcdemo.services.impl;

import com.example.mvcdemo.repositories.EmployeeRepository;
import com.example.mvcdemo.services.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;


    @Override
    public boolean exists() {
        return false;
    }
}
