package com.example.mvcdemo.services.impl;

import com.example.mvcdemo.repositories.CompanyRepository;
import com.example.mvcdemo.services.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public boolean exists() {
        return this.companyRepository.existsAllBy();
    }
}
