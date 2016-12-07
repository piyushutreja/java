package com.ace.blockingqueue.producer.consumer;
import java.util.concurrent.BlockingQueue;


public class Consumer extends Thread
{

	BlockingQueue<Integer> q ;
	
	Consumer(BlockingQueue<Integer> q)
	  {
		  this.q = q;
	  }
	
	public void run()
	{
		try 
		{
			for(int i = 0; i < 100; i++)
			{
				System.out.println("comsumed: "+ q.take());
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
