package com.aktanyusuf.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aktanyusuf.controller.IRestEmployeeController;
import com.aktanyusuf.dto.DtoEmployee;
import com.aktanyusuf.model.Employee;
import com.aktanyusuf.service.IEmployeeService;
import com.aktanyusuf.utils.RestPageableEntity;
import com.aktanyusuf.utils.RestPageableRequest;
import com.aktanyusuf.utils.RestRootEntity;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements IRestEmployeeController{

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list/pageable")
    @Override
    public RestRootEntity<RestPageableEntity<DtoEmployee>> findAllPageable(RestPageableRequest pageable) {
        Page<Employee> page= employeeService.findAllPageable(toPageable(pageable));
        RestPageableEntity<DtoEmployee> pageableResponse = toPageableResponse(page, employeeService.toDTOList(page.getContent()));
        return ok(pageableResponse);
    }

}
