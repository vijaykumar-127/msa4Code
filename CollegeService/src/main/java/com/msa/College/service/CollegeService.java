package com.msa.College.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msa.College.entity.College;
import com.msa.College.repository.CollegeRepo;

@Service
public class CollegeService {
	
	@Autowired
	private CollegeRepo collegeRepo;

	public College saveCollege(College college) {
		return collegeRepo.save(college);
	}

	public College findCollegeById(Long collegeId) {
		return collegeRepo.findByCollegeId(collegeId);
	}
}
