package com.springcore.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
	Demo s1 = (Demo) context.getBean("demo");
	System.out.println(s1);
	
	SpelExpressionParser temp = new SpelExpressionParser();
	Expression expression = (Expression) temp.parseExpression("33+44");
	System.out.println(expression.getValue());
	}

}
