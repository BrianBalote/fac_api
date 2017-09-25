package com.fujitsu.fac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.fujitsu.fac.dao.IQuestionsDAO;
import com.fujitsu.fac.dtos.QuestionDTO;
import com.fujitsu.fac.models.Question;

@Service
@ComponentScan({ "com.fujitsu.fac.dao" })
public class QuestionsService {

	@Autowired
	private IQuestionsDAO questionsDAO;
	
	public void saveQuestion(QuestionDTO questionDTO) {
		
		Question question = new Question(questionDTO);
		this.questionsDAO.saveQuestion(question);
	}
}
