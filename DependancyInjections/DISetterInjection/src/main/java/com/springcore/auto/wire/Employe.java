package com.springcore.auto.wire;

public class Employe {
	private String name;
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
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", address=" + address + "]";
	}
	public Employe(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
}
