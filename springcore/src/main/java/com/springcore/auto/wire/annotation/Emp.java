package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	@Autowired
	@Qualifier("address1") // when one or two bean inside xml, so we can use @Qualifier annotation
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public void setAddress(Address address) {
		System.out.println("setter method");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor");
	}

}
