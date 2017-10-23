package com.example.jdbcdemo.domain;

public class Ball {
	
	private long id;
	
	private String name;
	private int yearOfProduction;
	private double price;
	
	public Ball() {
	}
	
	public Ball(String name, int yob, double price) {
		super();
		this.name = name;
		this.yearOfProduction = yob;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public void setYearOfProduction(int yob) {
		this.yearOfProduction = yob;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
