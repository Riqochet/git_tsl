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
import com.tsl.model.Surfboard;

/**
 * Integration test showing the basic usage of {@link SurfboardRepository}.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = WebAppConfigTest.class)
public class SimpleSurfboardRepositoryTests {

	@Autowired SurfboardRepository repository;
	Surfboard surfboard;

	@Before
	public void setUp() {
		surfboard = new Surfboard();
		surfboard.setSurfboardname("foobar");
	}

	@Test
	public void findSavedSurfboardById() {

		surfboard = repository.save(surfboard);

		assertEquals(surfboard, repository.findOne(surfboard.getId()));
	}
	
	@Test
	public void findSavedSurfboardBySurfboardname() {
		
		final String name = "Aloha";
		
		surfboard.setSurfboardname(name);
		
		surfboard = repository.save(surfboard);
		
		assertEquals(surfboard, repository.findBySurfboardname(name)); 	
	}
}
