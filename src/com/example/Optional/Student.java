package com.example.Optional;

public class Student {
	private String name;
	private String city;
	private int age;
	public Student(String name,  int age,String city) {
		
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
