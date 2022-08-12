package com.msa.College.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long collegeId;
	private String collegeName;
	private int collegeTots;
	public Long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeTots() {
		return collegeTots;
	}
	public void setCollegeTots(int collegeTots) {
		this.collegeTots = collegeTots;
	}
	public College(Long collegeId, String collegeName, int collegeTots) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeTots = collegeTots;
	}
	public College() {
	}
	
	
	
	

}
