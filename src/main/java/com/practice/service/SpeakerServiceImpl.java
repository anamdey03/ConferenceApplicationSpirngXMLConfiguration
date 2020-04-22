package com.practice.service;

import java.util.List;

import com.practice.model.Speaker;
import com.practice.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository speakerRepository; 
	
	public SpeakerServiceImpl() {
		System.out.println("Inside default constructor of SpeakerServiceImpl");
	}

	public List<Speaker> findAll() {
		return speakerRepository.finalAll();
	}

	//Setter method which is used for Setter Injection
	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
		System.out.println("Inside SpeakerRepository setter of SpeakerServiceImpl");
		this.speakerRepository = speakerRepository;
	}
	
	//Autowiring by Name
//	public void setRepository(SpeakerRepository speakerRepository) {
//		System.out.println("Inside Repository setter of SpeakerServiceImpl");
//		this.speakerRepository = speakerRepository;
//	}

	// Construction which is used for Constructor Injection
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		System.out.println("Inside parametrized constructor of SpeakerServiceImpl");
		this.speakerRepository = speakerRepository;
	}
	
}
