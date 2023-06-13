package com.exterro.HibernateDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	private int facultyId;
	private String facultyName;
	private String facultyQualification;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int facultyId, String facultyName, String facultyQualification) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyQualification = facultyQualification;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getFacultyQualification() {
		return facultyQualification;
	}
	public void setFacultyQualification(String facultyQualification) {
		this.facultyQualification = facultyQualification;
	}
	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyQualification="
				+ facultyQualification + "]";
	}
}
