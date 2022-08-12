package com.msa.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msa.Student.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

	Student findByStudentId(Long studentId);

}
