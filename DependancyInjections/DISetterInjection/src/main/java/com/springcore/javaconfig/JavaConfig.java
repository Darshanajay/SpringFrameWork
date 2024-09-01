package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Sprite getSprite() {
		return new Sprite();
	}
	
	@Bean(name = {"student","temp","con"})
	public Student getStudent() {
		//creating a new Student object
		Student s = new Student(getSprite());
		return s;
	}
}
