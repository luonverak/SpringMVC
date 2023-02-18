package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	List<Student> getAllStudent();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deteletById(Long id);
}