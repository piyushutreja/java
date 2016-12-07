package com.java.ace.mutithreading.producerConsumer.q2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerCustomMain {

	public static void main(String[] args) throws InterruptedException {
		CustomDataStructure sharedQueue = new CustomDataStructure(10);
		Thread consumerThread = new Thread(new ConsumerCustom(sharedQueue));
		Thread producerThread = new Thread(new ProducerCutsom(sharedQueue));
		Thread oneMoreProducerThread = new Thread(new ProducerCutsom(sharedQueue));
		consumerThread.start();
		producerThread.start();
		oneMoreProducerThread.start();
		
	}
}
