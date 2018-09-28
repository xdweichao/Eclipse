package edu.citytech.cst.gui;

public class Food {
	private float simpleId;
	private String name;
	private String borough;
	private String cuisine;
	private Address address;
	private String zipcode;
	
	
	public Food(float simpleId, String name, String borough, String cuisine, Address address) {
		super();
		this.simpleId = simpleId;
		this.name = name;
		this.borough = borough;
		this.cuisine = cuisine;
		this.address = address;
	}


	public float getSimpleId() {
		return simpleId;
	}


	public void setSimpleId(float simpleId) {
		this.simpleId = simpleId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBorough() {
		return borough;
	}


	public void setBorough(String borough) {
		this.borough = borough;
	}


	public String getCuisine() {
		return cuisine;
	}


	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getZipcode() {
		return address.getZipcode();
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
