package com.prueba.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.test.models.Employees;
import com.prueba.test.models.Genders;

@Repository
public interface GendersRepository extends JpaRepository<Genders, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM GENDERS G WHERE G.ID = :id")		
	List<Genders> findByGender(long id);
	
}
