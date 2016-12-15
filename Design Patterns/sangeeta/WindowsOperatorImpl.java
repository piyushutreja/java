package com.sapient.usecase;

public class WindowsOperatorImpl implements Operator{

	@Override
	public void open() {
		System.out.println("window File is opened");
		
	}

	@Override
	public void read() {
		System.out.println("window File is read");
		
	}

	@Override
	public void write() {
		System.out.println("window File is  written");
		
	}

}
