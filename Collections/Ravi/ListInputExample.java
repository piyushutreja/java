package com.example.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListInputExample {

	public static void main(String[] args) {

		List<String> fruitsList = new ArrayList<>();
		System.out.println("Enter 5 fruits: \n");

		Scanner sc = new Scanner(System.in);
		String[] fruits = sc.nextLine().split(",");
		for (String fruit : fruits) {
			fruitsList.add(fruit.trim());
		}

		System.out.println("Before Sorting..................");
		for (String fruitName : fruitsList) {
			System.out.println("fruit : " + fruitName);
		}

		Collections.sort(fruitsList);
		System.out.println("After Sorting................");
		for (String fruitName : fruitsList) {
			System.out.println("fruit : " + fruitName);
		}

		System.out.println("Enter Fruit Name to search :");
		String serachFruit = sc.nextLine();

		System.out.println("Searching " + serachFruit + ".................");
		if (fruitsList.contains(serachFruit)) {
			System.out.println("Fruit : " + serachFruit + " is available");
		} else {
			System.out.println("Fruit : " + serachFruit + " not found.");
		}
	}
}
