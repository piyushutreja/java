package com.example.listdemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityExample {

	public static void main(String[] args) {
		Queue<Customer> myQueue = new PriorityQueue<>();
		
		Customer c1 = new Customer(1, "A");
		Customer c2 = new Customer(11, "A");
		Customer c3 = new Customer(51, "A");
		Customer c4 = new Customer(9, "A");

		myQueue.add(c1);
		myQueue.add(c2);
		myQueue.add(c3);
		myQueue.add(c4);

		System.out.println(myQueue);

		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
	}
}
