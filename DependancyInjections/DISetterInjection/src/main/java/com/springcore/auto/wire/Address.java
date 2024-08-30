package com.springcore.auto.wire;

public class Address {
	private String Street;
	private String City;
	private int Pincode;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + ", Pincode=" + Pincode + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, int pincode) {
		super();
		Street = street;
		City = city;
		Pincode = pincode;
	}
	
	
}
