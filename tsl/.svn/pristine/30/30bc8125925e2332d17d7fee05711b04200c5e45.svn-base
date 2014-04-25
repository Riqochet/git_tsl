package com.tsl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Surfboard class.
 * 
 */
@Entity
@Table(name = "Surfboards")
public class Surfboard {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(unique = true)
	private String surfboardname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * Returns the surfboardname.
	 * 
	 * @return
	 */
	public String getSurfboardname() {

		return surfboardname;
	}

	/**
	 * @param surfboardname
	 *            the surfboardname to set
	 */
	public void setSurfboardname(String surfboardname) {
		this.surfboardname = surfboardname;
	}
}
