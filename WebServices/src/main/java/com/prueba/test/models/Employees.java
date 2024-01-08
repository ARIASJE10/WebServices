package com.prueba.test.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="EMPLOYEES")
public class Employees {

	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "GENDER_ID")
	private long gender_id;
	
	@Column(name = "JOB_ID")
	private long job_id;
	
	@Column(name = "NAME")
	private String name;

	@Column(name = "LAST_NAME")
	private String last_name;
	
	@Column(name = "BIRTHDATE")
	private Date birthdate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getGender_id() {
		return gender_id;
	}

	public void setGender_id(long gender_id) {
		this.gender_id = gender_id;
	}

	public long getJob_id() {
		return job_id;
	}

	public void setJob_id(long job_id) {
		this.job_id = job_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
}
