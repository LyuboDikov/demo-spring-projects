package com.example.mvcdemo.repositories;

import com.example.mvcdemo.entities.Employee;
import com.example.mvcdemo.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    boolean existsAllBy();
}
