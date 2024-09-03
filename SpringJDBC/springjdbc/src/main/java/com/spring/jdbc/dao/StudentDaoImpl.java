package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Student;


@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int insert(Student std) {
		//insert query
	      String query = "insert into student(id,name,address) values(?,?,?)";
	      int r = this.jdbcTemplate.update(query, std.getId(),std.getName(),std.getAddress());
		return r;
	}
	
	public int change(Student std) {
		// updating data
		String query = "update student set name=?, address=? where id=?";
		int r=this.jdbcTemplate.update(query,std.getName(),std.getAddress(),std.getId());
		return r;
	}
	
	public Student getStudent(int stdid) {
		// Select single Student Data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RwoMapperimpl();
		Student std = this.jdbcTemplate.queryForObject(query, rowMapper,stdid);
		return std;
	}
	
	public int delete(int stdid) {
		// Deleting Data
	    String query = "delete from student where id=?";
	    int r = this.jdbcTemplate.update(query,stdid);
		return r;
	}
	
	public List<Student> getAllStudents() {
		// Selecting multiple Students
		String query = "select * from student";
		List<Student> std = this.jdbcTemplate.query(query,new RwoMapperimpl());
		return std;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

	
	

}
