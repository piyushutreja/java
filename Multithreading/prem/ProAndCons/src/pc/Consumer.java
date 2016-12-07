package pc;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private final BlockingQueue sQueue;
	
	public Consumer(BlockingQueue blockingQueue) {
		this.sQueue = blockingQueue;
	
	}
	
	@Override
	public void run() {
		while(true)
		{
			try {
				  System.out.println("Consumed: "+ sQueue.take());
				  Thread.sleep(2000);
			} catch (Exception e) {

			e.printStackTrace();
			}
			
		}
		
		
	}
}
