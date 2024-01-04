package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exampale {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Exampale() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Exampale [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("starting");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending");
	}

}
