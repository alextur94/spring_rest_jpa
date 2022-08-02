package com.turkovaleksey.spring.springboot2.spring_data_jpa.dao;

import com.turkovaleksey.spring.springboot2.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByName(String name);
}
