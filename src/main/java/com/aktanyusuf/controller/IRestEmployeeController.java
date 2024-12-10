package com.aktanyusuf.controller;

import com.aktanyusuf.model.Employee;
import org.springframework.data.domain.Page;

public interface IRestEmployeeController {

    public Page<Employee> findAllPageable(int pageNumber, int pageSize);

}
