package com.springcore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifeCycle/Lconfig.xml");
//	Sprite s1 = (Sprite)  context.getBean("s1");
//	System.out.println(s1);
	//registering shutdown hook
//	context.registerShutdownHook();
//	
//	System.out.println(" _________________________________ ");
//	
//	Pepsi p1 = (Pepsi) context.getBean("p1");
//	System.out.println(p1);
	
	Example example = (Example) context.getBean("example");
	System.out.println(example);
	
	
	
	
	}
}
