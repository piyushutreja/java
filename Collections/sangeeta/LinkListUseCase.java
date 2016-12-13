package com.sapient.fruitbasket;

import java.util.LinkedList;
import java.util.List;

public class LinkListUseCase 
{
	
	public static void main(String args[])
	{
		List<String> list = new LinkedList<String>();
		list.add("sangeeta");
		list.add("ravi");
		list.add("nitin");
		list.add("raju");
		list.add("neha");
		
		//remove 3rd friend as index start from 0 
		list.remove(2);
		System.out.println("list after removing 3rd friend");
		for(String str : list)
			System.out.println(str);
	}
	
	

}
