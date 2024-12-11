package com.aktanyusuf.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.aktanyusuf.dto.DtoEmployee;
import com.aktanyusuf.model.Employee;

public interface IEmployeeService {

    Page<Employee> findAllPageable(Pageable pageable);

    List<DtoEmployee> toDTOList(List<Employee> EmployeeList);

}
