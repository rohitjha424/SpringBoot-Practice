package com.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
