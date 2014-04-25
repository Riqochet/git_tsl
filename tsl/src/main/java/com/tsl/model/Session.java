package com.tsl.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Session class
 *
 */

@Entity
@Table (name="Sessions")
public class Session {
	
	@javax.persistence.Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private Date date;
	
	@ManyToOne
	private Surfboard surfboard;
	
	@ManyToOne
	private Spot spot;


	@Column
	private Integer waveheight;
	
	@Column
	private Integer waveperiod;
	
	@Column
	private Integer waveangle;
	
	@Column
	private Integer windstrength;
	
	@Column
	private Integer winddirection;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Surfboard getSurfboard() {
		return surfboard;
	}

	public void setSurfboard(Surfboard surfboard) {
		this.surfboard = surfboard;
	}

	public Spot getSpot() {
		return spot;
	}

	public void setSpot(Spot spot) {
		this.spot = spot;
	}

	public Integer getWaveheight() {
		return waveheight;
	}

	public void setWaveheight(Integer waveheight) {
		this.waveheight = waveheight;
	}

	public Integer getWaveperiod() {
		return waveperiod;
	}

	public void setWaveperiod(Integer waveperiod) {
		this.waveperiod = waveperiod;
	}

	public Integer getWaveangle() {
		return waveangle;
	}

	public void setWaveangle(Integer waveangle) {
		this.waveangle = waveangle;
	}

	public Integer getWindstrength() {
		return windstrength;
	}

	public void setWindstrength(Integer windstrength) {
		this.windstrength = windstrength;
	}

	public Integer getWinddirection() {
		return winddirection;
	}

	public void setWinddirection(Integer winddirection) {
		this.winddirection = winddirection;
	}

}
