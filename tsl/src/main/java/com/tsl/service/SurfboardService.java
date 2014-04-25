package com.tsl.service;

import java.util.List;

import com.tsl.exception.SurfboardNotFound;
import com.tsl.model.Surfboard;

public interface SurfboardService {

	public Surfboard create(Surfboard surfboard);

	public Surfboard delete(int id) throws SurfboardNotFound;

	public List<Surfboard> findAll();

	public Surfboard update(Surfboard surfboard) throws SurfboardNotFound;

	public Surfboard findById(int id);
}
