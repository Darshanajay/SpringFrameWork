package com.springcore.auto.wrie.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employe {
	
	private String name;
	@Autowired
	@Qualifier("address2") // Qualifier is used to select perticular bean to add address class values
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employe(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", address=" + address + "]";
	}
	
	
}
