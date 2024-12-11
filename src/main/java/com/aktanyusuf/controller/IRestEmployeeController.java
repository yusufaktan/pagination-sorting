package com.aktanyusuf.controller;

import com.aktanyusuf.dto.DtoEmployee;
import com.aktanyusuf.utils.RestPageableEntity;
import com.aktanyusuf.utils.RestPageableRequest;
import com.aktanyusuf.utils.RestRootEntity;

public interface IRestEmployeeController {

    public RestRootEntity<RestPageableEntity<DtoEmployee>> findAllPageable(RestPageableRequest pageableRequest);

}
