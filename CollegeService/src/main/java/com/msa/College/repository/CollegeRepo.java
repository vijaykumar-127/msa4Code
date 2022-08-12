package com.msa.College.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msa.College.entity.College;

@Repository
public interface CollegeRepo extends JpaRepository<College, Long> {

	College findByCollegeId(Long collegeId);
	

}
