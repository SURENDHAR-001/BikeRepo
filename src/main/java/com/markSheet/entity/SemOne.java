package com.markSheet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sem_one")
public class SemOne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int rollNo;
	private int theory;
	private int practicals;
	private int total;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getTheory() {
		return theory;
	}
	public void setTheory(int theory) {
		this.theory = theory;
	}
	public int getPracticals() {
		return practicals;
	}
	public void setPracticals(int practicals) {
		this.practicals = practicals;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	

}
