package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	
	private Sprite sprite;
	
	

	public Student(Sprite sprite) {
		super();
		this.sprite = sprite;
		// TODO Auto-generated constructor stub
	}

	
	
	public Sprite getSprite() {
		return sprite;
	}



	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}



	public void study() {
		this.sprite.disp();
		System.out.println("I am learning Spring FrameWork");
	}
}
