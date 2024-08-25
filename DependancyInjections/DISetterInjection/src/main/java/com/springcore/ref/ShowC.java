package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowC {
	public static void main(String[] args) {
		
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/Refconfig.xml");
	A temp= (A)context.getBean("aref");
	System.out.println(temp.getX());
	
	System.out.println(temp.getOb().getY());
	
	System.out.println(temp);
	}
}
