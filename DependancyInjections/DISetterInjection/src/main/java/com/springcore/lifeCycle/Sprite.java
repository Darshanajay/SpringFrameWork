package com.springcore.lifeCycle;

public class Sprite {
	private double Price;

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
		System.out.println("Setting Price");
	}

	public Sprite() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sprite [Price=" + Price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
}
