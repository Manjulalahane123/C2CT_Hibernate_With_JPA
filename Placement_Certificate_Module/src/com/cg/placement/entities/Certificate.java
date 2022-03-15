package com.cg.placement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="certificate" )
public class Certificate 
{
	@Id
	private int certificate_id;
	private int year;  // Year : int
	private String college;  // college : College
	
	
	public int getId() {
		return certificate_id;
	}
	public void setId(int certificate_id) {
		this.certificate_id = certificate_id;
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}





}
