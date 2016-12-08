package ayush.ace.day3.multithreading;

import java.util.concurrent.BlockingQueue;

public class CustomProducer implements Runnable {
	
	CustomThreadSafeList<Integer> q;
	
	CustomProducer(CustomThreadSafeList<Integer> q){
		
		this.q = q; 
		
	}
	
	@Override
	public void run(){
		
		int i= 1;
		
		while(i<100){
			try{
			System.out.println(Thread.currentThread()+  "produced value : " + i);
			q.add(Integer.valueOf(i++));	
			
			//Thread.sleep(5000);
			
			}
			catch(Exception ie){
				System.out.println("Exception " + ie);
				
			}
		
		
		
		
	}
	}
}
