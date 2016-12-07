package com.ace.list.producer.consumer;

public class Main 
{
	public static void main(String args[])
	{
	  CustomList list = new CustomList();
	  Consumer c = new Consumer(list);
	  Producer p = new Producer(list);
	  c.start();
	  p.start();
	}
}
