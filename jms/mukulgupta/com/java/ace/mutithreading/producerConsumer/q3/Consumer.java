package com.java.ace.mutithreading.producerConsumer.q3;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Consumer implements  Runnable{

	private final List<Integer> sharedQueue;
	
	public Consumer(List<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run(){
		for(int i=0; i < 10000; i++){
			try {
				
				consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {
		synchronized(Integer.class){
			while(sharedQueue.isEmpty()){
				Integer.class.wait();
			}
			System.out.println("From Consumer consumed " + sharedQueue.remove(sharedQueue.size()-1));
			Integer.class.notifyAll();
		}
		
		
	}
}
