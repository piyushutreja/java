package com.ace.list.producer.consumer;


public class Consumer extends Thread
{

	CustomList list ;
	
	Consumer(CustomList list)
	{
		this.list = list;
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
