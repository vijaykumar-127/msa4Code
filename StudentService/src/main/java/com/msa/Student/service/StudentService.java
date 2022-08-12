package com.msa.Student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msa.Student.VO.College;
import com.msa.Student.VO.ResponseTemplateVO;
import com.msa.Student.entity.Student;
import com.msa.Student.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	public ResponseTemplateVO getStudentWithCollege(Long studentId) {
		ResponseTemplateVO vo=new ResponseTemplateVO();
		Student student=studentRepo.findByStudentId(studentId);
		College college=restTemplate.getForObject("http://COLLEGE-SERVICE/college/"+student.getCollegeId(), College.class);
		vo.setStudent(student);
		vo.setCollege(college);
		return vo;
	}
	
	

}
