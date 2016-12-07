package com.ace.custom.producer.comsumer;


public class Consumer extends Thread
{

	SynchronizedList<Integer> list ;
	
	Consumer(SynchronizedList<Integer> count)
	{
		this.list = count;
	}
	
	public void run()
	{
		try 
		{
			for(int i = 0; i < 100; i++)
			{
				System.out.println("comsumed: "+ list.get());
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
