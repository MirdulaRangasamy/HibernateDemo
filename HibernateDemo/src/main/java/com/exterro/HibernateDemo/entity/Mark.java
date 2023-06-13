package com.exterro.HibernateDemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Mark {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resultId;
	@NotNull
	
	@ManyToOne
	@JoinColumn(name = "rollNo")
	private Student student;
	
	private int mark;

	public Mark(int resultId, Student student, int mark) {
		super();
		this.resultId = resultId;
		this.student = student;
		this.mark = mark;
	}

	public Mark() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Mark [resultId=" + resultId + ", student=" + student + ", mark=" + mark + "]";
	}
	
	

}
