package com.example.mvcdemo.services.impl;

import com.example.mvcdemo.services.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public boolean exists() {
        return false;
    }
}
