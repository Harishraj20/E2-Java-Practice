package com.example;

public class product {
	
	private String name;
	private String brand;
	private double price;
	private double discountPercent;
	private int totalQuantity;
	
	public product(String name, String brand, double price, double discountPercent, int totalQuantity) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.discountPercent = discountPercent;
		this.totalQuantity = totalQuantity;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
	
	
	
	
	
	
	
	

}
