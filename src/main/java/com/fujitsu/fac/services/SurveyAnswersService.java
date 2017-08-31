package com.fujitsu.fac.services;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.fujitsu.fac.dtos.SurveyAnswersDTO;

@Service
@ComponentScan({ "com.fujitsu.fac.dao" })
public class SurveyAnswersService {

	public void saveSurveyAnswers(SurveyAnswersDTO surveyAnswersDTO) {
		
	}
}
