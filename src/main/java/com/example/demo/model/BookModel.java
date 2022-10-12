package com.example.demo.model;

public class BookModel {

	private int ID;
	private String name;
	private String city;
	
	
	public BookModel(int iD, String name, String city) {
		super();
		ID = iD;
		this.name = name;
		this.city = city;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	@Override
	public String toString() {
		return "BookModel [ID=" + ID + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
