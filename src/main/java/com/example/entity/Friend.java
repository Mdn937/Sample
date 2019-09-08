package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Friend {
	
	@Id
	private String id;
	private String name;
	private String location;

}

