package ayush.ace.day3.multithreading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	BlockingQueue<Integer> q;
	
	Producer(BlockingQueue<Integer> q){
		
		this.q = q; 
		
	}
	
	@Override
	public void run(){
		
		int i= 1;
		
		while(i<100){
			try{
			System.out.println("Producer produced value : " + i);
			q.put(new Integer(i++));	
			
			//Thread.sleep(5000);
			
			}
			catch(InterruptedException ie){
				System.out.println("Exception ");
				
			}
		
		
		
		
	}
	}
}
