package com.sales.cycle.customer.criteria;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description="this class is customer")
@Getter
@Setter
public class CustomerCriteria implements Serializable{
	
	private static final long serialVersionUID = -7699812459222189469L;
	
	@ApiModelProperty(value = "customer-id" , name ="customer-name")
	private String customerId;

	@ApiModelProperty(value = "customer-Type" , name ="customer-Type_name")
	private CustomerTypeEnum customerTypeEnum;

}
