package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Student;

public interface StudentService {

	Student addStudent(Student student);

	Optional<Student> getStudentByID(int id);

	List<Student> getallStudent();

}
