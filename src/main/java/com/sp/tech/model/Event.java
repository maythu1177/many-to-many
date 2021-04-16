package com.sp.tech.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String country;

	
	@ManyToMany(cascade=CascadeType.PERSIST)
	private List<Speaker> speaker = new ArrayList<>();
	
	


	public Event(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	
	
	
	

}
