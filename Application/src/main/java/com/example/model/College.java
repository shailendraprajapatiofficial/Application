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
	private int id;
	private String name;
	private String email;
//	(mappedBy = "college",cascade = CascadeType.ALL)
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "college", cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id")
	@JsonManagedReference
	private List<Student> students;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public College(int id, String name, String email, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.students = students;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", email=" + email + ", students=" + students + "]";
	}
	
	

}
