package com.example.listdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class TreeMap {

	public static void main(String[] args) {

		int min = 0;
		int max = 10;
		Integer[] arrRandomNumber = new Integer[15];
		for (int i = 0; i < 15; i++) {
			arrRandomNumber[i] = ThreadLocalRandom.current().nextInt(min,
					max + 1);
		}

		System.out.println("Random Elements : \n");
		for (int i = 0; i < arrRandomNumber.length; i++) {
			System.out.print(arrRandomNumber[i] + ",");
		}

		System.out.println();
		Set<Integer> setData = new HashSet<>();
		for (int i = 0; i < arrRandomNumber.length; i++) {
			setData.add(arrRandomNumber[i]);
		}

		System.out.println("Unique Elements : " + setData);

		Arrays.sort(arrRandomNumber, new IntegerComparator());

		Set<Integer> treeSet = new TreeSet<>();
		for (Integer value : arrRandomNumber) {
			treeSet.add(value);
		}

		System.out.println("Pre Sorted Order = " + treeSet);
	}

	static class IntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	}

}
