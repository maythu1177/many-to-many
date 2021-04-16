package com.sp.tech.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sp.tech.model.Event;
import com.sp.tech.model.Speaker;
import com.sp.tech.repo.EventRepo;

@Service
public class EventService {

	private final EventRepo eventRepo;

	public EventService(EventRepo eventRepo) {
		super();
		this.eventRepo = eventRepo;
	}

	@Transactional
	public void saveEvent() {
		Event e1 = new Event("Java", "Japan");
		Event e2 = new Event("JavaScript", "Myannamr");
		Event e3 = new Event("Python", "Australia");

		Speaker s1 = new Speaker("John", "Java");
		Speaker s2 = new Speaker("Julian", "CS");
		Speaker s3 = new Speaker("Jone", "Security");
		
		
		e1.getSpeaker().add(s1);
		e1.getSpeaker().add(s2);
		e1.getSpeaker().add(s3);
		
		e2.getSpeaker().add(s2);
		
		e3.getSpeaker().add(s3);
		
		eventRepo.save(e1);
		eventRepo.save(e2);
		eventRepo.save(e3);
	}

}
