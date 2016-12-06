package com.sapient.ace.jms;

import java.io.Serializable;

public class Order implements Serializable{
	
	private int orderId;
	private int quantity;
	private double price;
	private String description;
	private String status;
	
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Order(int orderId, int quantity,double price, String description,String status) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
		this.status = status;
	}
}
