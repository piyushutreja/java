package com.ace.blockingqueue.producer.consumer;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread
{
  BlockingQueue<Integer> q ;
  
  Producer(BlockingQueue<Integer> q)
  {
	  this.q = q;
  }
  
	public void run()
	{
		for(int i = 0 ; i< 100; i++)
		{
			System.out.println("put: " + i);
			try 
			{
				q.put(i);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
