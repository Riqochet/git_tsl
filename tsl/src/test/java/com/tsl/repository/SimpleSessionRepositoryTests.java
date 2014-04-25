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
import com.tsl.model.Session;
import com.tsl.model.Spot;
import com.tsl.model.Surfboard;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes=WebAppConfigTest.class)
public class SimpleSessionRepositoryTests {

	@Autowired SessionRepository sessionRepository;
	@Autowired SurfboardRepository surfboardRepository;
	@Autowired SpotRepository spotRepository;
	private Session session;
	
	@Before
	public void setUp() {
		
		Surfboard surfboard = new Surfboard();
		surfboard.setSurfboardname("Aloha");
		surfboardRepository.save(surfboard);
		
		Spot spot = new Spot();
		spot.setSpotname("Whitesands");
		spotRepository.save(spot);
		
		session = new Session();
		session.setSurfboard(surfboard);
		session.setSpot(spot);
		
	}
	
	@Test
	public void findSavedSessionBySpot() {
		
		session = sessionRepository.save(session);
		
		assertEquals(session, sessionRepository.findSavedSessionBySpot(session.getSpot()));
	}
}
