package com.exterro.HibernateDemo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity

public class Student {
	@Id
	private int rollNo;
	private String studName;
	private float studGrade;
	
	public Student() {
		super();
	}
	public Student(int rollNo, String studName, float studGrade) {
		super();
		this.rollNo = rollNo;
		this.studName = studName;
		this.studGrade = studGrade;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public float getStudGrade() {
		return studGrade;
	}
	public void setStudGrade(float studGrade) {
		this.studGrade = studGrade;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", studGrade=" + studGrade + "]";
	}
}
