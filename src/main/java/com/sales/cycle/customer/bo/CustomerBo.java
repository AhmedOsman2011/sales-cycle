package com.sales.cycle.customer.bo;

import com.sales.cycle.contactinfo.ContactInfoBo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerBo {
	
	private String code;
	
	private String name;
	
	private String address;
	
	private ContactInfoBo contactInfoBo;
}
