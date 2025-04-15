package com.example.service;

import java.lang.System.Logger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.College;
import com.example.model.Student;
import com.example.repository.CollegeRepo;
import com.example.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;
	@Autowired
	CollegeRepo collegeRepo;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student);
		int id = student.getCollege().getcollegeId();
		Optional<College> byId = collegeRepo.findById(id);
		System.out.println(byId.get().getcollegeEmail());
		student.setCollege(byId.get());

//		student.setCollege(byId);

//		student.getCollege().getName();

		System.out.println(byId);
		return studentRepo.save(student);
	}

	@Override
	public Optional<Student> getStudentByID(int id) {

		// TODO Auto-generated method stub

		return studentRepo.findById(id);

	}

	@Override
	public List<Student> getallStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

}
