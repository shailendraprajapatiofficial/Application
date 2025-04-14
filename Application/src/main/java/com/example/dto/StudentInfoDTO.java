package com.example.dto;

public class StudentInfoDTO {
	
	private String studentId;
	private String studentEmail;
	private String name;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentInfoDTO(String studentId, String studentEmail, String name) {
		super();
		this.studentId = studentId;
		this.studentEmail = studentEmail;
		this.name = name;
	}
	

}
