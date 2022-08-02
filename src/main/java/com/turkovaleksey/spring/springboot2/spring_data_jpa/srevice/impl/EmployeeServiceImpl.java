package com.turkovaleksey.spring.springboot2.spring_data_jpa.srevice.impl;

import com.turkovaleksey.spring.springboot2.spring_data_jpa.dao.EmployeeRepository;
import com.turkovaleksey.spring.springboot2.spring_data_jpa.entity.Employee;
import com.turkovaleksey.spring.springboot2.spring_data_jpa.srevice.api.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class EmployeeServiceImpl implements Service<Employee> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveOrUpdate(Employee entity) {
        employeeRepository.save(entity);
    }

    @Override
    public Employee getByID(Integer id) {
        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            employee = optional.get();
        }
        return employee;
    }

    @Override
    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> employees = employeeRepository.findAllByName(name);
        return employees;
    }


}
