package com.alphanumerix.java8.data;

public class Student {
	
	private Integer enrollNumber;
	private String name;
	private String location;
	
	public Student(Integer enrollNumber, String name, String location) {
		this.enrollNumber = enrollNumber;
		this.name = name;
		this.location = location;
	}
	
	public Integer getEnrollNumber() {
		return enrollNumber;
	}
	public void setEnrollNumber(Integer enrollNumber) {
		this.enrollNumber = enrollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	
}
