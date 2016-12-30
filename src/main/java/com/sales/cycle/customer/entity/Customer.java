package com.sales.cycle.customer.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer implements Serializable{
	private static final long serialVersionUID = 6936273948503225560L;

	private Long id;
	
	private String name;
}
