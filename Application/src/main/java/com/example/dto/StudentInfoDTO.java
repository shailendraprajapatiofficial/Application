package com.example.dto;

public class StudentInfoDTO {

	private int studentId;
	private String studentName;
	private String studentEmail;
	private String collegeName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public StudentInfoDTO(int studentId, String studentName, String studentEmail, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.collegeName = collegeName;
	}
	public StudentInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}