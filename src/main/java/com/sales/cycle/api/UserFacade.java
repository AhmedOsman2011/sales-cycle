package com.sales.cycle.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(path = "/warehouse", consumes = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "/warehouse", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public interface UserFacade {

	String login(String userName, String password);

	void addUser(@RequestHeader("Access-Token") String accessToken, String salesPersonCode, String userName,
			String password);

}
