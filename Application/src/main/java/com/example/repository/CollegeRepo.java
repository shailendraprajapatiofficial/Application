package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.College;
@Repository
public interface CollegeRepo extends JpaRepository<College, Integer>{
	
}
