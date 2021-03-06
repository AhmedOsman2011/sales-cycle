package com.sales.cycle.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(path="/user" , consumes=MediaType.APPLICATION_JSON_VALUE)
@Api(value="/user"  , consumes=MediaType.APPLICATION_JSON_VALUE , produces =MediaType.APPLICATION_JSON_VALUE)
public interface WarehouseFacade {

}
