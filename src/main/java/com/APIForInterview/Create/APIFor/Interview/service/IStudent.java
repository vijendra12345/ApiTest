package com.APIForInterview.Create.APIFor.Interview.service;

import java.util.List;

import com.APIForInterview.Create.APIFor.Interview.model.Student;

public interface IStudent {
	 Student findById(Integer id);
	    List<Student> findAll();
	    void save(Student user);
	     void update(Student user);
		void delete(Integer id); 
}
