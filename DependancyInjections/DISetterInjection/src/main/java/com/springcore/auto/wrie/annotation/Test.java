package com.springcore.auto.wrie.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context	= new ClassPathXmlApplicationContext("com/springcore/auto/wrie/annotation/Autoconfig.xml");
	
	Employe emp = (Employe) context.getBean("Empl");
	System.out.println(emp); 
	
	}

}
