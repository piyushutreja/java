package com.ace.list.producer.consumer;

import java.util.ArrayList;
import java.util.List;

public class CustomList 
{
	List<Integer> list = new ArrayList<>();
	final int CAPACITY = 10;
	boolean isUpdated = false;
	
	public synchronized int get() throws InterruptedException 
	{
		if(list.size() == 0 )
		{
			wait();
		}
		
		notify();
		return (int)list.remove(0);
	}

	public synchronized void put(int num) throws InterruptedException 
	{
		if(list.size() == CAPACITY)
		{
			wait();
		}
		
		list.add(num);
		notify();
	}
}
