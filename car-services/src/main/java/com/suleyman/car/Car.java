package com.suleyman.car;

import javax.persistence.*;

@Entity
@Table
public class Car {
	
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@Column(name="MODEL")
	private String model;
	
	@Column(name="YEAR")
	private int year;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
