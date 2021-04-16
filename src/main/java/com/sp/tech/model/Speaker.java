package com.sp.tech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Speaker {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String experties;

	public Speaker(String name, String experties) {
		super();
		this.name = name;
		this.experties = experties;
	}
	
	
	
	

}
