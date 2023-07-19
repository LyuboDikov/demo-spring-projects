package com.example.mvcdemo.services.impl;

import com.example.mvcdemo.services.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Override
    public boolean exists() {
        return false;
    }
}
