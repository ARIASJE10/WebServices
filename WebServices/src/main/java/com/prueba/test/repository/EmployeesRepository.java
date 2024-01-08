package com.prueba.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.test.models.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM EMPLOYEES E WHERE E.NAME = :name AND E.LAST_NAME = :last_name")		
	List<Employees> findByNameAndLastName(String name, String last_name);
	
	@Query(nativeQuery = true, value = "SELECT * FROM EMPLOYEES E WHERE E.ID = :id ")		
	List<Employees> findById(long id);
	
	@Query(nativeQuery = true, value = "SELECT * FROM EMPLOYEES E WHERE E.JOB_ID = :id ")		
	List<Employees> findByJobId(long id);
}
