package com.sales.cycle.customer.facade;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.sales.cycle.api.CustomerFacade;
import com.sales.cycle.customer.criteria.CustomerCriteria;
import com.sales.cycle.customer.entity.Customer;

import io.swagger.annotations.ApiParam;

@Controller
public class CustomerFacadeImpl implements CustomerFacade{

	@Override
	public ResponseEntity<Customer> customers(@ApiParam(value = "datasources"  ) @RequestBody CustomerCriteria customerCriteria) {
		return ResponseEntity.ok(new Customer());
	}

}
