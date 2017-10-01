package com.fujitsu.fac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fujitsu.fac.dtos.QuestionDTO;
import com.fujitsu.fac.services.QuestionsService;

@RestController
@ComponentScan({ "com.fujitsu.fac.services" })
public class QuestionsController {

	@Autowired
	private QuestionsService questionsService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/question/add")
	public ResponseEntity<String> addQuestion(@RequestBody QuestionDTO questionDTO) {
		try {
			this.questionsService.saveQuestion(questionDTO);
		} catch (Exception ex) {
			return new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	}
}
