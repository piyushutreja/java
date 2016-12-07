package com.java.ace.mutithreading.producerConsumer.q2;

import java.util.concurrent.BlockingQueue;

public class ProducerCutsom implements Runnable{
	
	private final CustomDataStructure sharedQueue;
	
	public ProducerCutsom(CustomDataStructure sharedQueue){
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run(){
		for(int i=0; i < 10; i++){
			try {
				System.out.println("From Producer produced" + i);
				sharedQueue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
