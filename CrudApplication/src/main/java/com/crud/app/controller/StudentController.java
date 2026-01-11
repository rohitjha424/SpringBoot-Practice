package com.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crud.app.entity.Student;
import com.crud.app.repository.StudentRepository;

@RestController
public class StudentController {
	
	
	@Autowired
	StudentRepository studentRepository;

	//get all the students 
	
	//localhost:8080/students
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		
		List<Student> students = studentRepository.findAll() ;
		return students;
	}
	
	//localhost:8080/students/1
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student= studentRepository.findById(id).get();
		return student;
	}
}
