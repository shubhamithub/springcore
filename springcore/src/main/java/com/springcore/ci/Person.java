package com.springcore.ci;

public class Person {
	private String personname;
	private int personId;
	
	public Person(String personname,int personId) {
		this.personname=personname;
		this.personId=personId;
	}

	@Override
	public String toString() {
		
		return this.personname+" : "+this.personId;
	}

}
