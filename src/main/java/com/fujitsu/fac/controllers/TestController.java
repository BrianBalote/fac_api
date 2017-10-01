package com.fujitsu.fac.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("Success", HttpStatus.FOUND);
	}
}
