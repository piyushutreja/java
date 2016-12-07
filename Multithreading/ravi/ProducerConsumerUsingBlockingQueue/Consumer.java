package com.example.demo;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable
{
	private final BlockingQueue<Integer> myQueue;

	public Consumer(final BlockingQueue<Integer> myQueue)
	{
		this.myQueue = myQueue;
	}

	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				int value = myQueue.take();
				System.out.println("Consuming value : " + value);
				System.out.println("---------------------------------------------------------------");
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
