package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String Name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> cources;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCources() {
		return cources;
	}
	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}
	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> cources) {
		super();
		Name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.cources = cources;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
