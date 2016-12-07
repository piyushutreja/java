package com.ace.custom.producer.comsumer;


public class Producer extends Thread
{
  SynchronizedList<Integer> list;
  
  Producer(SynchronizedList<Integer> count)
  {
	  this.list = count;
  }
  
	public void run()
	{
		for(int i = 0 ; i< 100; i++)
		{
			System.out.println("put: " + i);
			try 
			{
				list.add(i);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
