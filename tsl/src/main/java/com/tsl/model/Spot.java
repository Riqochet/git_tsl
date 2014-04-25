package com.tsl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Spot class.
 * 
 */
@Entity
@Table(name = "SurfSpots")
public class Spot {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column(unique = true)
	private String spotname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSpotname() {
		return spotname;
	}

	public void setSpotname(String spotname) {
		this.spotname = spotname;
	}
}
