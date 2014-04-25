package com.tsl.service;

import java.util.List;

import com.tsl.exception.SpotNotFound;
import com.tsl.model.Spot;

public interface SpotService {

	public Spot create(Spot spot);

	public Spot delete(int id) throws SpotNotFound;

	public List<Spot> findAll();

	public Spot update(Spot spot) throws SpotNotFound;

	public Spot findById(int id);
}
