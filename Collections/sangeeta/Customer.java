package com.sapient.fruitbasket;

public class Customer {
	int id;
	String name;
	
	Customer(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public String toString()
	{
		return "id: " + id + ", name: " + name;
	}
}
