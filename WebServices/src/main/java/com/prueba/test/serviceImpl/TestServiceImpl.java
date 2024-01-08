package com.prueba.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.test.models.Employee_Worked_Hours;
import com.prueba.test.models.Employees;
import com.prueba.test.repository.EmployeeWorkedHoursRepository;
import com.prueba.test.repository.EmployeesRepository;
import com.prueba.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private EmployeesRepository employeeRespository;
	
	@Autowired
	private EmployeeWorkedHoursRepository employeeWorkedHoursRepository;
	
	@Override
	public Employees save(Employees empleyees) {
		return employeeRespository.save(empleyees);
	}

	@Override
	public List<Employees> findAll() {
		return employeeRespository.findAll();
	}

	@Override
	public List<Employees> findByNameAndLastName(String name, String last_name) {
		return employeeRespository.findByNameAndLastName(name, last_name);
	}

	@Override
	public Employee_Worked_Hours save(Employee_Worked_Hours employee_Worked_Hours) {
		return employeeWorkedHoursRepository.save(employee_Worked_Hours);
	}

}
