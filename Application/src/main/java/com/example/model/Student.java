package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentid;
	private String studentName;
	private String studentEmail;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@ManyToOne
	private College college;

	public Long getStudentid() {
		return studentid;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Student(Long studentid, String studentName, String studentEmail, College college) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", college=" + college + "]";
	}
	
	
}
