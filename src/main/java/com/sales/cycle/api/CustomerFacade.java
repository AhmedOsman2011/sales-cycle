package com.sales.cycle.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.cycle.customer.criteria.CustomerCriteria;
import com.sales.cycle.customer.entity.Customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(path="/customer" , consumes=MediaType.APPLICATION_JSON_VALUE)
@Api(value="/customer"  , consumes=MediaType.APPLICATION_JSON_VALUE , produces =MediaType.APPLICATION_JSON_VALUE)
public interface CustomerFacade {
	
	@RequestMapping
	@GetMapping
	@ApiOperation(nickname ="getCustomers", value = "/" , response=Customer.class , httpMethod="GET" ) 
	public ResponseEntity<Customer> customers( @ApiParam(value = "The Datasource Information." ,required=true ) @RequestBody CustomerCriteria customerCriteria);

}
