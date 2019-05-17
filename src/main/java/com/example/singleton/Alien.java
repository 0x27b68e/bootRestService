package com.example.singleton;

import org.springframework.stereotype.Component;

//make Alien class as bean
@Component
public class Alien {
	
	public Alien() {
		super();
		System.out.println("Just creating Alien Object.....");
	}
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}

}
