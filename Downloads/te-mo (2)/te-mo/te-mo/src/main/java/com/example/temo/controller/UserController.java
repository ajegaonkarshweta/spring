package com.example.temo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.temo.dto.Dto;
import com.example.temo.model.Student;
import com.example.temo.model.User;
import com.example.temo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/student/save")
	public String saveStudent(@RequestBody Dto dto) {
		try {userService.saveDto(dto);
			
		}catch(Exception e) {
			return "failed";
		}
		return "success";
		}
	@GetMapping("/user/get/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	@GetMapping("/student/get/{id}")
	public Student getStudentById(@PathVariable int id) {
		return userService.getStudentById(id);
	}
	
	
	@PutMapping("/user/update/{id}")
	public User updateUser(@RequestBody User newUser) {
		return userService.updateUser(newUser);
	}
	@PutMapping("/student/update/{id}")
	public Student updateStudent(@RequestBody Student newStudent) {
		return userService.updateStudent(newStudent);
	}
	@DeleteMapping("/user/delete/{id}")
	public void deleteUser(@PathVariable Integer id) {
		 userService.deleteUser(id);
	}
	@DeleteMapping("/student/delete/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		userService.deleteStudent(id);
	}
    @RequestMapping(value="/dtoPage",method = RequestMethod.GET)
    public String dtoPage()
    {
    return "dtoHome";
    }
    @RequestMapping(value="/dtoPages",method = RequestMethod.POST)
    public String WelcomePage(ModelMap m,@RequestParam String userName,@RequestParam String email)
    {
    	
    if(userName.equals("Abhi")&& email.equals("Abhi123"))
    {
    m.put("user",userName);
      return "welcome";
    }
    m.put("errorMsg","Please provide correct userName and email");
    return "dtoHome";
    }
}


