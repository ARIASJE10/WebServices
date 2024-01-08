package com.prueba.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.test.dao.Dao;
import com.prueba.test.models.Employee_Worked_Hours;
import com.prueba.test.models.Employees;
import com.prueba.test.request.RequestConsultaTotalHoras;
import com.prueba.test.request.RequestEmployeeByJob;
import com.prueba.test.request.RequestPagoEmpleado;
import com.prueba.test.response.ResponseConsultaTotalHoras;
import com.prueba.test.response.ResponseEmployee;
import com.prueba.test.response.ResponseEmployeeByJob;
import com.prueba.test.response.ResponseEmployeeWorkedHours;
import com.prueba.test.response.ResponsePagoEmpleado;
import com.prueba.test.service.TestService;

@RestController
@RequestMapping("/release")
public class EmployeeController {

	@Autowired
	private TestService employeeService;
	
	@Autowired
	private Dao service;
	
	@GetMapping
	public List<Employees> obtenerEmployees(){
		return employeeService.findAll();	
	}

	@PostMapping("/agregarEmployees")
	public ResponseEntity<?> agregarEmployee(@RequestBody Employees employees) throws Exception{
		
		try {
			ResponseEmployee response = service.agregarEmpleado(employees);
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@PostMapping("/agregarHorasTrabajadas")
	public ResponseEntity<?> agregarHorasTrabajadas(@RequestBody Employee_Worked_Hours employees) throws Exception{
		
		try {
			ResponseEmployeeWorkedHours response = service.agregarHorasTrabajadas(employees);
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@PostMapping("/consultarEmpleadoPorPuesto")
	public ResponseEntity<?> obtenerEmpleado(@RequestBody RequestEmployeeByJob employees) throws Exception{
		
		try {
			ResponseEmployeeByJob response = service.obtenerEmpleadoPorPuesto(employees);
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/consultarTotalHorasTrabajadas")
	public ResponseEntity<?> consultarTotalDeHoras(@RequestBody RequestConsultaTotalHoras requestConsultaTotalHoras) throws Exception{
		
		try {
			ResponseConsultaTotalHoras response = service.consultarTotalHorasTrabajadas(requestConsultaTotalHoras);
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@PostMapping("/consultarPagoEmpleado")
	public ResponseEntity<?> consultarPagoEmpleado(@RequestBody RequestPagoEmpleado request) throws Exception{
		
		try {
			ResponsePagoEmpleado response = service.consultarPagoEmpleado(request);
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
