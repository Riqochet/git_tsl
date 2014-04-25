package com.tsl.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tsl.model.Spot;

public interface SpotRepository  extends JpaRepository<Spot, Integer> {

	/**
	 * Find all surf spots with given name. This method will be translated into a query by constructing it directly
	 * from the method name as there is no other query declared.
	 * 
	 * @param spotname
	 * @return Spot
	 */
	Spot findBySpotname(String spotname);

}
