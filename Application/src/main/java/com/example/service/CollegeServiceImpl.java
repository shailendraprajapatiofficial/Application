package com.example.service;

import java.util.List;
import java.util.Optional;
import com.example.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.College;
import com.example.model.Student;
import com.example.repository.CollegeRepo;

@Service
public class CollegeServiceImpl implements CollegeService {

    private final StudentRepo studentRepo;
	@Autowired
	CollegeRepo collegeRepo;

    CollegeServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

	@Override
	public College addCollege(College college) {
		// TODO Auto-generated method stub
		//college.getStudents();
		return collegeRepo.save(college);
	}

	@Override
	public Optional<College> getCollege(int id) {
		// TODO Auto-generated method stub
		Optional<College> all = collegeRepo.findById(id);
		System.out.println(all);
		
//		List<Student> all2 = studentRepo.findAll();
		for(Student a1: all.get().getStudents()) {
			System.out.println(a1);
		}
		
		return all;
	}
	
	

}
