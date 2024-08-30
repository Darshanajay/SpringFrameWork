package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) {
	ApplicationContext	context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/Autoconfig.xml");
	Employe em1 = (Employe)context.getBean("Empl");
	System.out.println(em1);
	}
}
