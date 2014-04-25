package com.tsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsl.model.Surfboard;
  
public interface SurfboardRepository extends JpaRepository<Surfboard, Integer> {

	/**
	 * Find all surfboard with given surfboard name. This method will be translated into a query by constructing it directly
	 * from the method name as there is no other query declared.
	 * 
	 * @param surfboardname
	 * @return
	 */
	Surfboard findBySurfboardname(String surfboardname);
}