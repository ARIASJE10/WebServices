package com.prueba.test.service;

import java.util.List;

import com.prueba.test.models.Employee_Worked_Hours;
import com.prueba.test.models.Employees;

public interface TestService {

	public List<Employees> findByNameAndLastName(String name, String last_name);
	
	public Employees save (Employees empleyees);
	
	public List<Employees> findAll();
	
	public Employee_Worked_Hours save(Employee_Worked_Hours employee_Worked_Hours);
}
