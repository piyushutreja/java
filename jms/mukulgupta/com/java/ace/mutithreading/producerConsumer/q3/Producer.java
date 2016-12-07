package com.java.ace.mutithreading.producerConsumer.q3;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private final List<Integer> sharedQueue;
	
	public Producer(List<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run(){
		for(int i=0; i < 10000; i++){
			try {
				//System.out.println("From Producer produced" + i);
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		synchronized (Integer.class) {
			while(sharedQueue.size() == 10){
				Integer.class.wait();
			}
			sharedQueue.add(i);
			Integer.class.notifyAll();
		}
		
	}
	

}
