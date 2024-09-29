package com.database;

public class Customer {
	
	String name;
	int age;
	String email;
	int mobileNumber;
	public Customer(String name, int age, String email, int mobileNumber) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	









}
