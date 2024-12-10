package com.aktanyusuf.service.impl;

import com.aktanyusuf.model.Employee;
import com.aktanyusuf.repository.EmployeeRepository;
import com.aktanyusuf.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAllPageable(Pageable pageable) {
        Page<Employee> page = employeeRepository.findAllPageable(pageable);
        return page;
    }
}
