package com.example.temo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.temo.dto.Dto;
import com.example.temo.model.Student;
import com.example.temo.model.User;
@Service
public interface UserService {

	void saveDto(Dto dto);

	User getUserById(int id);
	Student getStudentById(int id);
	
	User updateUser(@RequestBody User newUser);

	Student updateStudent(@RequestBody Student newStudent);
	
	void deleteUser(Integer id);
	
	void deleteStudent(Integer id);
	
	

}
