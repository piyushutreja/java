package com.example.listdemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> friendsList = new LinkedList<>();
		System.out.println("Enter 5 Friends: \n");

		Scanner sc = new Scanner(System.in);
		String[] friends = sc.nextLine().split(",");
		for (String friend : friends) {
			friendsList.add(friend.trim());
		}

		for (String friend : friendsList) {
			System.out.println("Friend : " + friend);
		}

		System.out.println("After Removing 3rd Friend: ");
		friendsList.remove(2);
		for (String friend : friendsList) {
			System.out.println("Friend : " + friend);
		}
	}
}
