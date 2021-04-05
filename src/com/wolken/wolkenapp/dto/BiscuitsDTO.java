package com.wolken.wolkenapp.dto;

import java.util.List;

public class BiscuitsDTO implements Comparable<BiscuitsDTO> {
	private int id;
	private String brand;
	private int quantity;
	private String name;
	private double price;
	//data 
	public BiscuitsDTO() {
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

	
	@Override
	public String toString() {
		return "BiscuitsDTO [id=" + id + ", brand=" + brand + ", quantity=" + quantity + ", name=" + name + ", price="
				+ price + "]";
	}

	@Override
	public int compareTo(BiscuitsDTO o) {
		// TODO Auto-generated method stub
		return this.hashCode()-o.hashCode();
	}


}
