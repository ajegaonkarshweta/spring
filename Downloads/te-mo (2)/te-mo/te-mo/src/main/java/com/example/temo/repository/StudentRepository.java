package com.example.temo.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.temo.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Id> {
	
	Student findById(int id);

	Student getById(int id);

	void deleteById(Integer id);

}
