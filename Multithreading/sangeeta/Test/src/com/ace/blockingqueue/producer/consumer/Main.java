package com.ace.blockingqueue.producer.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Main 
{
	public static void main(String args[])
	{
	  BlockingQueue<Integer> q = new LinkedBlockingQueue<Integer>();
	  Consumer c = new Consumer(q);
	  Producer p = new Producer(q);
	  c.start();
	  p.start();
	}
}
