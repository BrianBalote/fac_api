package com.fujitsu.fac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fujitsu.fac.dtos.AttendeeDTO;
import com.fujitsu.fac.services.AttendeeService;

@RestController
@ComponentScan({ "com.fujitsu.fac.services" })
public class AttendeeController {

	@Autowired
	private AttendeeService attendeeService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/attendee/add")
	public ResponseEntity<String> addAttendee(@RequestBody AttendeeDTO attendee) {
		
		System.out.println("@ AttendeeController.addAttendee()");
		System.out.println(attendee.toString());
		try {
			this.attendeeService.addAttendee(attendee);
		} catch (Exception ex) {
			return new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	}
}
