package com.tsl.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.tsl.init.WebAppConfigTest;
import com.tsl.model.Spot;

/**
 * Integration test showing the basic usage of {@link SpotRepository}.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = WebAppConfigTest.class)
public class SimpleSurfSpotRepositoryTests {

	@Autowired SpotRepository repository;
	Spot spot;

	@Before
	public void setUp() {
		spot = new Spot();
		spot.setSpotname("foobar");
	}

	@Test
	public void findSavedSurfSpotById() {

		spot = repository.save(spot);

		assertEquals(spot, repository.findOne(spot.getId()));
	}
	
	@Test
	public void findSavedSpotBySurfSpotname() {
		
		final String name = "Whitesands";
		
		spot.setSpotname(name);
		
		spot = repository.save(spot);
		
		assertEquals(spot, repository.findBySpotname(name)); 	
	}
}
