package com.example.mvcdemo.repositories;

import com.example.mvcdemo.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    boolean existsAllBy();
}
