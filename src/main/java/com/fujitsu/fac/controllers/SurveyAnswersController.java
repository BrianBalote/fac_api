package com.fujitsu.fac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fujitsu.fac.dtos.SurveyAnswersDTO;
import com.fujitsu.fac.services.SurveyAnswersService;

@RestController
@ComponentScan({ "com.fujitsu.fac.services" })
public class SurveyAnswersController {

	@Autowired
	private SurveyAnswersService surveyAnswersService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/attendee/add")
	public ResponseEntity<String> saveSurveyAnswers(@RequestBody SurveyAnswersDTO surveyAnswersDTO) {
		
		System.out.println("@ AttendeeController.addAttendee()");
		System.out.println(surveyAnswersDTO.toString());
		try {
			this.surveyAnswersService.saveSurveyAnswers(surveyAnswersDTO);
		} catch (Exception ex) {
			return new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	} 
}
