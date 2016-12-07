package pc2;

import java.util.List;

public class Producer implements Runnable {

	private final List list;

	public Producer(List list) {
		this.list = list;

	}

	@Override
	public void run() {

		for (int i = 0; i < 8; i++) {
			try {
				synchronized (list) {
					System.out.println("produced : " +i);
					list.add(i);
					Thread.sleep(1000);
				}
				
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}

	}

}
