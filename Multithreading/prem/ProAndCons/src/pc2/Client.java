package pc2;

import java.util.ArrayList;
import java.util.List;

public class Client {

	
	public static void main(String[] args) {
		
		List sharedQueue = new ArrayList(10);
		 
	     //Creating Producer and Consumer Thread
	     Thread prodThread = new Thread(new Producer(sharedQueue));
	     Thread consThread = new Thread(new Consumer(sharedQueue));

	     //Starting producer and Consumer thread
	     prodThread.start();
	     consThread.start();
	    }


	
}
