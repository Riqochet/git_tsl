package com.tsl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tsl.exception.SpotNotFound;
import com.tsl.model.Spot;
import com.tsl.repository.SpotRepository;

public class SpotServiceImpl implements SpotService {

	@Autowired SpotRepository spotRepository;
	
	@Override
	public Spot create(Spot spot) {
		Spot createdSpot = spot;
		return spotRepository.save(createdSpot);
	}

	@Override
	public Spot delete(int id) throws SpotNotFound {
		Spot deletedSpot = spotRepository.findOne(id);
		
		if(deletedSpot == null) {
			throw new SpotNotFound("Could not find spot to delete with id " + id);
		}
		
		spotRepository.delete(deletedSpot);
		return deletedSpot;
	}

	@Override
	public List<Spot> findAll() {
		return spotRepository.findAll();
	}

	@Override
	public Spot update(Spot spot) throws SpotNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spot findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
