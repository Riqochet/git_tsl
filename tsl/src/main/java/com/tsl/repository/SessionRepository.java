package com.tsl.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsl.model.Session;
import com.tsl.model.Spot;

public interface SessionRepository extends JpaRepository<Session, Integer>{
	
	Session findSavedSessionByDate(Date date);
	
	Session findSavedSessionBySpot(Spot spot);
}
