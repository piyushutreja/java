package com.java.ace.mutithreading.producerConsumer.q1;

import java.util.concurrent.BlockingQueue;

public class Consumer implements  Runnable{

	private final BlockingQueue<Integer> sharedQueue;
	
	public Consumer(BlockingQueue<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run(){
		for(int i=0; i < 10000; i++){
			try {
				System.out.println("From Consumer consumed " + sharedQueue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
