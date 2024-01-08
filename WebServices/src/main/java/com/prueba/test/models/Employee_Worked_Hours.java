package com.prueba.test.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="EMPLOYEE_WORKED_HOURS")
public class Employee_Worked_Hours {

	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "EMPLOYEE_ID")
	private long employee_id;
	
	@Column(name = "WORKED_HOURS")
	private long worked_hours;
	
	@Column(name = "WORKED_DATE")
	private Date worked_date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}

	public long getWorked_hours() {
		return worked_hours;
	}

	public void setWorked_hours(long worked_hours) {
		this.worked_hours = worked_hours;
	}

	public Date getWorked_date() {
		return worked_date;
	}

	public void setWorked_date(Date worked_date) {
		this.worked_date = worked_date;
	}
}

