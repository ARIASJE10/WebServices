package com.prueba.test.response;

import java.util.ArrayList;
import java.util.List;

import com.prueba.test.models.Employees;

public class ResponseEmployeeByJob {

	private List<Employees> employees;
	private String success;
	
	public List<Employees> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
}
