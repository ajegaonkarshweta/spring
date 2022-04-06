package com.example.temo.repository;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.temo.model.Student;
import com.example.temo.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Id>{

	User getById(int id);

	void deleteById(int id);

	

}
