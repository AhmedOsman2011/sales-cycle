package com.sales.cycle.salesperson.bo;

import com.sales.cycle.base.bo.AbstractBo;
import com.sales.cycle.contactinfo.ContactInfoBo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(description="this class is salesperson which responsible of doing the trnsactions")
public class SalespersonBo extends AbstractBo{

	@ApiModelProperty(value = "code" , name ="salesperson code")
	private String code;

	@ApiModelProperty(value = "name" , name ="salesperson name")
	private String name;

	private ContactInfoBo contactInfoBo;

	private SalespersonAccount salespersonAccount;
}
