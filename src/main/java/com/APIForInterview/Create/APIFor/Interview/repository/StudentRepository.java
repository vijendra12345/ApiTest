package com.APIForInterview.Create.APIFor.Interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.APIForInterview.Create.APIFor.Interview.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
