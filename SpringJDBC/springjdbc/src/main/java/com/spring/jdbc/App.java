package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Good Morning" );
        
        
      ApplicationContext context =   new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
      StudentDao studentDao = (StudentDao) context.getBean("studentDao");
      
      Student std = new Student();
      std.setId(88);
      std.setName("Guru");
      std.setAddress("Mysore");
      
      int r = studentDao.insert(std);
      
      System.out.println("Student added"+r);
    }
}
