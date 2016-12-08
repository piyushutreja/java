package ayush.ace.day3.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestProducerConsumer {
	
	public static void main(String[] args){

		BlockingQueue<Integer> q = new ArrayBlockingQueue<>(10);

		
		
	Thread producer = new Thread(new Producer(q));
	Thread producer1 = new Thread(new Producer(q));
	Thread consumer = new Thread(new Consumer(q));
	
	producer.start();
	producer1.start();
//	consumer.start();
	
	
	
	
	}
	
}
