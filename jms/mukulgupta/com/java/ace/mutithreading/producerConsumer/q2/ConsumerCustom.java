package com.java.ace.mutithreading.producerConsumer.q2;

import java.util.concurrent.BlockingQueue;

public class ConsumerCustom implements  Runnable{

	private final CustomDataStructure sharedQueue;
	
	public ConsumerCustom(CustomDataStructure sharedQueue){
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run(){
		for(int i=0; i < 10; i++){
			try {
				System.out.println("From Consumer consumed " + sharedQueue.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
