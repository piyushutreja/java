package com.java.ace.mutithreading.producerConsumer.q3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerMain {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> sharedQueue = new ArrayList<>();
		Thread consumerThread = new Thread(new Consumer(sharedQueue));
		Thread producerThread = new Thread(new Producer(sharedQueue));
		consumerThread.start();
		producerThread.start();
		
	}
}
