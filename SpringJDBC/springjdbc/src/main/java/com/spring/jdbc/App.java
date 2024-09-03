package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        
        
      ApplicationContext context = 
    		  new AnnotationConfigApplicationContext(JDBCconfig.class);
      StudentDao studentDao = (StudentDao) context.getBean("studentDao");
      
//      Student std = new Student();
//      std.setId(17);
//      std.setName("Kiran");
//      std.setAddress("Kandanakovi");
//      
//      
//      
//      int r = studentDao.insert(std);
//      
//      System.out.println("Student added"+r);
      
      
      
//      Student std = new Student();
//      std.setId(121);
//      std.setName("Srujan B");
//      std.setAddress("Durga");
//      
//      int r = studentDao.change(std);
//      System.out.println("Data Changed"+r);
      
      //Delete
//      int r = studentDao.delete(44);
//      System.out.println("deleted" + r);
      
//      Student std = studentDao.getStudent(11);
//      System.out.println(std);
      
      List<Student> std = studentDao.getAllStudents();
      
      for (Student s : std) {
		System.out.println(s);
	}
      
    }
}
