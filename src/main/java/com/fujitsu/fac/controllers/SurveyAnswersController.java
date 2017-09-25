package com.fujitsu.fac.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan({ "com.fujitsu.fac.services" })
public class SurveyAnswersController {

	/*
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
	*/
}
