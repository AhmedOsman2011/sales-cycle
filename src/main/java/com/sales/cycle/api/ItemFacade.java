package com.sales.cycle.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(path="/item" , consumes=MediaType.APPLICATION_JSON_VALUE)
@Api(value="/item"  , consumes=MediaType.APPLICATION_JSON_VALUE , produces =MediaType.APPLICATION_JSON_VALUE)
public interface ItemFacade {

}
