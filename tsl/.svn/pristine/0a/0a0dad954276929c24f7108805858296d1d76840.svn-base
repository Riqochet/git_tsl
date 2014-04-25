package com.tsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.tsl.exception.SurfboardNotFound;
import com.tsl.init.WebAppConfigTest;
import com.tsl.model.Surfboard;
import com.tsl.repository.SurfboardRepository;
import com.tsl.service.SurfboardService;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = WebAppConfigTest.class)
public class SurfboardServiceTest {
	
	@Autowired SurfboardRepository repository;
	@Autowired SurfboardService surfboardService;
	Surfboard surfboard;

	@Before
	public void setUp() {
		surfboard = new Surfboard();
		surfboard.setSurfboardname("foobar");
	}
	
	@Test
	public void createSurfboard() throws SurfboardNotFound {
		
		surfboard = surfboardService.create(surfboard);		
		int surfboardId = surfboard.getId();
		
		assertNotNull(surfboardService.findById(surfboardId));
		
	}
	
	@Test
	public void deleteSurfboard() throws SurfboardNotFound {
		
		surfboard = repository.save(surfboard);		
		int surfboardId = surfboard.getId();

		surfboardService.delete(surfboardId);
		
		assertNull(surfboardService.findById(surfboardId));
		
	}
	
	@Test(expected=SurfboardNotFound.class)
	public void deleteSurfboardIdNotFound() throws SurfboardNotFound {
		
		final int surfboardId = 99999999; // TODO Improve by checking id isn't stored
		
		surfboardService.delete(surfboardId);
		
		fail("Expected an exception owing to no matching surfboard stored"); 
		
	}
	
	@Test
	public void findSurfboardById() {
		
		final String name = "Aloha";

		surfboard.setSurfboardname(name);		
		surfboard = repository.save(surfboard);
			
		Surfboard surfboardFound = surfboardService.findById(surfboard.getId());
		
		assertEquals(name, surfboardFound.getSurfboardname()); 
	}
	
	@Test
	public void findAllSurfboards() throws SurfboardNotFound {
		
		final int expectedNumberOfSurfboards = 2;
		
		Surfboard surfboard2 = new Surfboard();
		surfboard2.setSurfboardname("Aloha");
		
		repository.save(surfboard);
		repository.save(surfboard2);
			
		List<Surfboard> allSurfboards = surfboardService.findAll();
		
		assertEquals(expectedNumberOfSurfboards, allSurfboards.size()); 
	}
	
	@Test
	public void updateSurfboard() throws SurfboardNotFound {
		
		final String name = "Aloha";
		
		surfboard = repository.save(surfboard);
		
		surfboard.setSurfboardname(name);
		surfboard = surfboardService.update(surfboard);
		
		assertEquals(surfboard, repository.findBySurfboardname(name));
	}
	
	@Test(expected=SurfboardNotFound.class)
	public void updateSurfboardNull() throws SurfboardNotFound {
		
		surfboard = null;
		surfboard = surfboardService.update(surfboard);
		
		fail("Expected an exception owing to null object");
	}
	
	@Test(expected=SurfboardNotFound.class)
	public void updateSurfboardNoId() throws SurfboardNotFound {
		
		final String name = "Aloha";	
		
		surfboard.setSurfboardname(name);		
		surfboard = surfboardService.update(surfboard);
		
		fail("Expected an exception owing to no Id"); 
	}
	
	@Test(expected=SurfboardNotFound.class)
	public void updateSurfboardIdNotFound() throws SurfboardNotFound {
		
		final String name = "Aloha";	
		final int id = 99999999; // TODO Improve by checking id isn't stored
		
		surfboard.setId(id);
		surfboard.setSurfboardname(name);		
		surfboard = surfboardService.update(surfboard);
		
		fail("Expected an exception owing to no matching surfboard stored"); 
	}
}
