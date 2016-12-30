package com.sales.cycle.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.cycle.customer.entity.Customer;
import com.sales.cycle.salesperson.bo.SalespersonBo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(path="/salesPerson" , consumes=MediaType.APPLICATION_JSON_VALUE)
@Api(value="/salesPerson"  , consumes=MediaType.APPLICATION_JSON_VALUE , produces =MediaType.APPLICATION_JSON_VALUE)
public interface SalesPersonFacade {

	@RequestMapping
	@PutMapping
	@ApiOperation(nickname ="addSalesperson", value = "/" , response=Customer.class , httpMethod="PUT" ) 
	void create(@ApiParam(value = "salespersons"  ) @RequestBody SalespersonBo salesperson);

}
