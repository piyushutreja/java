package ayush.ace.day3.multithreading;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	
	
	BlockingQueue<Integer> q;
	
	Consumer(BlockingQueue<Integer> q){
		
		this.q = q; 
		
	}
	
	@Override
	public void run(){
		
		while(true){
		try{
		
					
			System.out.println("Consumer read value: " + q.take());
			
			Thread.sleep(2000);
			
		}catch(InterruptedException ie){
			System.out.println();
		}
		
		
		}
	}
	
}
