package com.example.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//make Alien class as bean
@Component
@Scope(value = "prototype") // create new object from every calling, object is not created while it is not called.
public class Alien {
	
	public Alien() {
		super();
		System.out.println("Just creating prototype.....");
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
