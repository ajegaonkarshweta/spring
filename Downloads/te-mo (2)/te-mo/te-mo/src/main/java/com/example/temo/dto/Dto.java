package com.example.temo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



public class Dto {
	
	private int id;
	private String userName;
	private String email;
	private int rollNo; 
	private String studentName;
	private String schoolName;
	private int english;
	private int science;
	private int maths;
	private int history;
	private int hindi;
	private int per;
	public Dto(int id, String userName, String email, int rollNo, String studentName, String schoolName, int english,
			int science, int maths, int history, int hindi, int per) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.schoolName = schoolName;
		this.english = english;
		this.science = science;
		this.maths = maths;
		this.history = history;
		this.hindi = hindi;
		this.per = per;
	}
	
	public Dto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	
	
}
