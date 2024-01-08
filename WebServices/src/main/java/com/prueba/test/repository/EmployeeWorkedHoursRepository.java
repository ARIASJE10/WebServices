package com.prueba.test.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.test.models.Employee_Worked_Hours;
import com.prueba.test.models.Employees;

@Repository
public interface EmployeeWorkedHoursRepository extends JpaRepository<Employee_Worked_Hours, Long> {

	@Query(nativeQuery = true, value = "SELECT SUM(E.WORKED_HOURS) FROM EMPLOYEE_WORKED_HOURS E WHERE E.WORKED_DATE BETWEEN :startDate AND :endDate")		
	int ObtenerTotalHoras(Date startDate, Date endDate);
	
}