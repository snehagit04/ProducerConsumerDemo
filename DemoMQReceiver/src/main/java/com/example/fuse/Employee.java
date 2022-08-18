package com.example.fuse;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


//@XmlRootElement(name = "Employee")
@JsonPropertyOrder("{id ,name }")

public class Employee {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + getId() + ", name=" + getName() + "]";
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
		
	}
	
	
	
}
