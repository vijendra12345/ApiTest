package com.APIForInterview.Create.APIFor.Interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.APIForInterview.Create.APIFor.Interview.model.Student;
import com.APIForInterview.Create.APIFor.Interview.repository.StudentRepository;

import java.util.List;


@Service
public class StudentServiceImpl implements IStudent {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student findById(Integer id) {
      
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    @Override
    public List<Student> findAll() {
     
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Student student) {
     
        studentRepository.save(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
      
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }

    @Override
    @Transactional
    public void update(Student student) {

        if (studentRepository.existsById(student.getId())) {
            studentRepository.save(student); 
            } else {
            throw new RuntimeException("Student not found with id: " + student.getId());
        }
    }

	}
