package com.sales.cycle.account.bo;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbstractAccount {

	BigDecimal createdOrders;
	
	BigDecimal balance;
	
	BigDecimal balanceLimit;
	
}
