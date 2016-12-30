package com.sales.cycle.user.facade;

import org.springframework.beans.factory.annotation.Autowired;

import com.sales.cycle.api.UserFacade;
import com.sales.cycle.user.manager.UserManager;

public class UserFacadeImpl implements UserFacade{

	@Autowired
	private UserManager userManager;
	
	@Override
	public String login(String userName, String password) {
		return userManager.login(userName, password);
	}

	@Override
	public void addUser(String accessToken, String salesPersonCode, String userName, String password) {
		userManager.addUser(accessToken, salesPersonCode, userName, password);
	}
	

}
