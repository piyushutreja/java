package pc;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private final BlockingQueue sQueue;

	public Producer(BlockingQueue blockingQueue) {
		this.sQueue = blockingQueue;

	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("produced " +i);
				sQueue.put(i);
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}

	}

}
