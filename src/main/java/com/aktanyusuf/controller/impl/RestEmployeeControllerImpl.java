package com.aktanyusuf.controller.impl;

import com.aktanyusuf.controller.IRestEmployeeController;
import com.aktanyusuf.model.Employee;
import com.aktanyusuf.service.IEmployeeService;
import com.aktanyusuf.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl implements IRestEmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping(path = "/list/pageable")
    @Override
    public Page<Employee> findAllPageable(@RequestParam(value = "pageNumber") int pageNumber, @RequestParam(value = "pageSize") int pageSize) {

        return employeeService.findAllPageable(PageRequest.of(pageNumber, pageSize));
    }
}
