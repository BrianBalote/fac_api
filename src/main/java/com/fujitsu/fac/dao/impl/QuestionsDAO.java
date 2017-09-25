package com.fujitsu.fac.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fujitsu.fac.dao.IQuestionsDAO;
import com.fujitsu.fac.models.Question;

@Repository
@Transactional
@EntityScan({ "com.fujitsu.fac.models" })
public class QuestionsDAO implements IQuestionsDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void saveQuestion(Question question) {
		
		System.out.println("@ QuestionsDAO.saveQuestion()");
		System.out.println(question.toString());
		try {
			em.persist(question);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
