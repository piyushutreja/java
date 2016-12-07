package com.ace.custom.producer.comsumer;

public class SynchronizedList<T> 
{
	CustomList<T> list = new CustomList<>();
	final int CAPACITY = 5;
	boolean isUpdated = false;
	
	public synchronized T get() throws InterruptedException 
	{
		if(list.size() == 0 )
		{
			wait();
		}
		
		notify();
		return (T)list.remove(0);
	}

	public synchronized void add(T t) throws InterruptedException 
	{
		if(list.size() == CAPACITY)
		{
			wait();
		}
		
		list.add(t);
		notify();
	}
}
