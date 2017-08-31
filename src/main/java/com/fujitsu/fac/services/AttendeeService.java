package com.fujitsu.fac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.fujitsu.fac.dao.IAttendeeDAO;
import com.fujitsu.fac.dtos.AttendeeDTO;
import com.fujitsu.fac.models.Attendee;

@Service
@ComponentScan({ "com.fujitsu.fac.dao" })
public class AttendeeService {

	@Autowired
	private IAttendeeDAO attendeeDAO;
	
	public void addAttendee(AttendeeDTO attendeeDto) {
		
		Attendee attendee = new Attendee(attendeeDto);
		this.attendeeDAO.addAttendee(attendee);;
	}
}
