package com.prueba.test.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.test.models.Employees;
import com.prueba.test.models.Jobs;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM JOBS J WHERE J.ID = :id")		
	List<Jobs> findByJob(long id);
	
	
}
