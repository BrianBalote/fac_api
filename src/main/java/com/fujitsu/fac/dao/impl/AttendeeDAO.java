package com.fujitsu.fac.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fujitsu.fac.dao.IAttendeeDAO;
import com.fujitsu.fac.models.Attendee;

@Repository
@Transactional
@EntityScan({ "com.fujitsu.fac.models" })
public class AttendeeDAO implements IAttendeeDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void addAttendee(Attendee attendee) {
		try {
			em.persist(attendee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
