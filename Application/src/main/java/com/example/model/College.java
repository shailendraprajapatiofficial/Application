package com.example.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.FetchType;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="college")
public class College {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collegeId;
	private String collegeName;
	private String collegeEmail;
//	(mappedBy = "college",cascade = CascadeType.ALL)
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "college", cascade = CascadeType.ALL)
    
	@JsonManagedReference
	private List<Student> students;
	public int getcollegeId() {
		return collegeId;
	}
	public void setId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getcollegeName() {
		return collegeName;
	}
	public void setcollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getcollegeEmail() {
		return collegeEmail;
	}
	public void setcollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public College(int collegeId, String collegeName, String collegeEmail, List<Student> students) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeEmail = collegeEmail;
		this.students = students;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeEmail=" + collegeEmail + ", students=" + students + "]";
	}
	
	

}
