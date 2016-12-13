package com.sapient.fruitbasket;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueApp {
	
	public static void main(String args[])
	{
		Comparator<Customer> c = new Comparator<Customer>() {
			
			@Override
			public int compare(Customer o1, Customer o2) {
				if(o1.id > o2.id)
					return 1;
				if(o1.id < o2.id)
					return -1;
				return 0;
			}
		};
		PriorityQueue<Customer> q = new PriorityQueue<Customer>(3, c);
		q.add(new Customer(10, "sangeeta"));
		q.add(new Customer(1, "reeta"));
		q.add(new Customer(15, "nidhi"));
		q.add(new Customer(19, "meena"));
		q.add(new Customer(10, "raju"));
		
		for(Customer customer : q)
			System.out.println(customer);
	}
	
	public static <T> T min(T[] a)
	{
		return a[0];
	}

}
