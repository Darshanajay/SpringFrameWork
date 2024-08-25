package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class show {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		
		Person p1=(Person) context.getBean("person");
		System.out.println(p1);
		
		Addition add = (Addition)context.getBean("Addition");
		add.doSum();
	}
}
