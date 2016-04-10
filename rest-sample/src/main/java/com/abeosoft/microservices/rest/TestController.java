package com.abeosoft.microservices.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/sayhello/{name}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<String> helloController(@PathVariable String name) {
		return new ResponseEntity<String>("Hello " + name, HttpStatus.OK);
	}
}
