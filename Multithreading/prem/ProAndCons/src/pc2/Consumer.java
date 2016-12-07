package pc2;

import java.util.List;

public class Consumer implements Runnable {
	private final List list;
	
	public Consumer(List list) {
		this.list = list;
	
	}
	
	@Override
	public void run() {
		while(true)
		{
			try {
					 System.out.println("Consumed: "+ list.get(0));
					 list.remove(0);
					 Thread.sleep(1000);
				
				 
			} catch (Exception e) {

			e.printStackTrace();
			}
			
		}
		
	}
}
