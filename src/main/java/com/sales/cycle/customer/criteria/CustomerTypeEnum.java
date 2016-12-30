package com.sales.cycle.customer.criteria;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Customer Type Enum")
public enum CustomerTypeEnum {
	
	@ApiModelProperty(value = "Album type", dataType = "string")
	NORMAL,
	
	UPNORMAL;

}
