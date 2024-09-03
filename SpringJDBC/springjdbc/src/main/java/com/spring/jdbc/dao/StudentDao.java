package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	public int insert(Student std);
	
	public int change(Student std);
	
	public int delete(int stdid);
	
	public Student getStudent(int stdid);
	
	public List<Student> getAllStudents();
}
