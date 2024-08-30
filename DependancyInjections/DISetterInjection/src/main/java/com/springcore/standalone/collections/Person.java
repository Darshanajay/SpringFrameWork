package com.springcore.standalone.collections;

import java.util.List;
import java.util.Set;

public class Person {
	private List<String> frds;
	private Set<String> number; 

	public Set<String> getNumber() {
		return number;
	}

	public void setNumber(Set<String> number) {
		this.number = number;
	}

	public List<String> getFrds() {
		return frds;
	}

	public void setFrds(List<String> frds) {
		this.frds = frds;
	}

	@Override
	public String toString() {
		return "Person [frds=" + frds + ", number=" + number + "]";
	}

	
	
	
}
