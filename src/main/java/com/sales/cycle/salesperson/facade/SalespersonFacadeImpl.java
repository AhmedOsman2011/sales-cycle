package com.sales.cycle.salesperson.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.sales.cycle.api.SalesPersonFacade;
import com.sales.cycle.salesperson.bo.SalespersonBo;
import com.sales.cycle.salesperson.manager.SalespersonManager;

import io.swagger.annotations.ApiParam;

@Controller
public class SalespersonFacadeImpl implements SalesPersonFacade{

	@Autowired
	private SalespersonManager salespersonManager;
	
	@Override
	public void create(@ApiParam(value = "salespersons"  ) @RequestBody SalespersonBo salesperson) {
		salespersonManager.create(salesperson);
	}


}
