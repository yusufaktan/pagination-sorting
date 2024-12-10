package com.aktanyusuf.service;

import com.aktanyusuf.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {

    Page<Employee> findAllPageable(Pageable pageable);

}
