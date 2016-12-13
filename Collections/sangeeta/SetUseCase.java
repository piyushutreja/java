package com.sapient.fruitbasket;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetUseCase 
{

	public static void main(String arg[])
	{
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < 15; i++)
		{
			int randomNum = new Random().nextInt(11); 
			set.add(randomNum);
		}
		
		Comparator<Integer> com = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		
	TreeSet<Integer> tree = new TreeSet<Integer>(com);
	tree.addAll(set);
	
	System.out.println("After sorting");
	for(Integer num: tree)
		System.out.println(num);
	
	
	Set<Integer> sortedSet = new TreeSet<Integer>();
	for(int i = 0; i < 15; i++)
	{
		int randomNum = new Random().nextInt(11); 
		sortedSet.add(randomNum);
	}
	System.out.println("already sorted set");
	for(Integer num: sortedSet)
		System.out.println(num);
	
	}
}
