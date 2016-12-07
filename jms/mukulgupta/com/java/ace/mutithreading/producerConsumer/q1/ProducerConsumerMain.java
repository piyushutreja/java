package com.java.ace.mutithreading.producerConsumer.q1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerMain {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<>(10);
		Thread consumerThread = new Thread(new Consumer(sharedQueue));
		Thread producerThread = new Thread(new Producer(sharedQueue));
		consumerThread.start();
		producerThread.start();
		
	}
}
