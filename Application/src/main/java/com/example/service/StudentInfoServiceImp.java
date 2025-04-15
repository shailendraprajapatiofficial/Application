package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.StudentInfoDTO;
import com.example.model.Student;
import com.example.repository.StudentRepo;

@Service
public class StudentInfoServiceImp implements StudentInfoService {
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<StudentInfoDTO> getStudentInfo() {
		// TODO Auto-generated method stub
		return studentRepo.findAll().stream().map(this::convertEntityToDTO).collect(Collectors.toList());
	}

	private StudentInfoDTO convertEntityToDTO(Student student) {

		StudentInfoDTO studentInfoDTO = new StudentInfoDTO();
		studentInfoDTO.setStudentId(student.getStudentId());
		studentInfoDTO.setStudentName(student.getStudentName());
		studentInfoDTO.setStudentEmail(student.getStudentEmail());
		studentInfoDTO.setCollegeName(student.getCollege().getcollegeEmail());

		return studentInfoDTO;

	}

}
