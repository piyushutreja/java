package com.java.ace.mutithreading.producerConsumer.q2;

public class CustomDataStructure {
	
	private final int arr[];
	
	private volatile int length; 
	
	public CustomDataStructure(int size) {
		arr = new int [size];
		length = 0;
	}

	public int get() throws InterruptedException{
		synchronized(Integer.class){
			while(length == 0){
				Integer.class.wait();
			}
			int element = arr[--length];
			Integer.class.notifyAll();
			return element;
		}
	}
	
	public void put(int i) throws InterruptedException{
		synchronized (Integer.class) {
			while(length == 10){
				Integer.class.wait();
			}
			arr[length++] = i;
			Integer.class.notifyAll();
		}
	}
}
