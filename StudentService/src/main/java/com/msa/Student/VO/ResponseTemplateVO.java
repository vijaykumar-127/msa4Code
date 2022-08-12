package com.msa.Student.VO;

import com.msa.Student.entity.Student;

public class ResponseTemplateVO {
	
	private Student student;
	private College college;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public ResponseTemplateVO(Student student, College college) {
		this.student = student;
		this.college = college;
	}
	public ResponseTemplateVO() {
	}
	
	

}
