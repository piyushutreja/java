package ayush.ace.day3.multithreading;

import java.util.concurrent.BlockingQueue;

public class CustomConsumer implements Runnable{

	
	
	CustomThreadSafeList<Integer> q;
	
	CustomConsumer(CustomThreadSafeList<Integer> q){
		
		this.q = q; 
		
	}
	
	@Override
	public void run(){
		
		while(true){
		try{
		
					
			System.out.println("Consumer read value: " + q.remove());
			//q.remove();
			Thread.sleep(0);
			
		}catch(InterruptedException ie){
			System.out.println();
		}
		
		
		}
	}
	
}
