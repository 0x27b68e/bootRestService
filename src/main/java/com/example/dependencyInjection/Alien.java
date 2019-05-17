package com.example.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	
	@Autowired // search Laptop object and then using it
	@Qualifier(value = "laptop") // search Laptop object by "laptop" bean
	private Laptop laptop;
	
	public void infoLaptop() {
		laptop.info();
	}
	
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
