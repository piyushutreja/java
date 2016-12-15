package com.sapient.usecase;

public class LinuxOperatorImpl implements Operator{

	@Override
	public void open() {
		System.out.println("Linux File is opened");
		
	}

	@Override
	public void read() {
		System.out.println("Linux File is read");
		
	}

	@Override
	public void write() {
		System.out.println("Linux File is  written");
		
	}

}
