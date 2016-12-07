package com.ace.custom.producer.comsumer;

public class Main 
{
	public static void main(String args[])
	{
	  SynchronizedList<Integer> list = new SynchronizedList<>();
	  Consumer c = new Consumer(list);
	  Producer p = new Producer(list);
	  c.start();
	  p.start();
		
		/*CustomList<Integer> list = new CustomList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		list.add(120);
		list.add(130);
		list.add(140);
		list.add(150);
		list.add(160);
		list.add(170);
		
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.remove(3));
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(180);
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.remove(5));
		System.out.println(list.remove(10));
		
		System.out.println(list);
		System.out.println(list.size());*/
	}
}
