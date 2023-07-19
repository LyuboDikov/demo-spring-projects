package com.example.mvcdemo.services.impl;

import com.example.mvcdemo.repositories.ProjectRepository;
import com.example.mvcdemo.services.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public boolean exists() {
        return this.projectRepository.existsAllBy();
    }
}
