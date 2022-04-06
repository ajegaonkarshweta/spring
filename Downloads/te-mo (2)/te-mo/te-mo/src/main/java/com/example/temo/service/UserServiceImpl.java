package com.example.temo.service;

import javax.persistence.Id;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.temo.dto.Dto;
import com.example.temo.model.Student;
import com.example.temo.model.User;

import com.example.temo.repository.StudentRepository;
import com.example.temo.repository.UserRepository;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	StudentRepository stuRepo;
	
	@Autowired
	UserRepository userRepo;
	

	@Override
	public void saveDto(Dto dto) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.setId(dto.getId());
		stu.setEnglish(dto.getEnglish());
		stu.setHindi(dto.getHindi());
		stu.setHistory(dto.getHistory());
		stu.setMaths(dto.getMaths());
		stu.setSchoolName(dto.getSchoolName());
		stu.setStudentName(dto.getStudentName());
		stu.setScience(dto.getScience());
		
		
		
		int add=dto.getEnglish()+dto.getHindi()+dto.getHistory()+dto.getMaths()+dto.getScience()+dto.getHindi();
		float per=add/6;
		stu.setPer(per);
		
		User ue=new User();
		
		ue.setId(dto.getId());
		ue.setUserName(dto.getUserName());
		ue.setEmail(dto.getEmail());
		ue.setRollNo(dto.getRollNo());
		
		stuRepo.save(stu);
		userRepo.save(ue);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepo.getById(id);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return stuRepo.getById(id);
	}

	@Override
	public User updateUser(User newUser) {
		// TODO Auto-generated method stub
		Integer id= newUser.getId();
		newUser = userRepo.save(newUser);
		return newUser;
	}

	@Override
	public Student updateStudent(Student newStudent) {
		// TODO Auto-generated method stub
		Integer id=newStudent.getId();
		newStudent=stuRepo.save(newStudent);
		return newStudent;
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
		
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		stuRepo.deleteById(id);
	}

	

	

	
	

	

	

	

}
