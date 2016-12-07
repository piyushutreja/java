package com.ace.list.producer.consumer;


public class Producer extends Thread
{
  CustomList list;
  
  Producer(CustomList list)
  {
	  this.list = list;
  }
  
	public void run()
	{
		for(int i = 0 ; i< 100; i++)
		{
			System.out.println("put: " + i);
			try 
			{
				list.put(i);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
