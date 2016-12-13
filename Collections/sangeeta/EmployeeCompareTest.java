package com.sapient.fruitbasket;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeCompareTest implements Comparable<EmployeeCompareTest> 
{

	int empId;
	String name;
	
	EmployeeCompareTest(int id, String name)
	{
		this.empId = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(EmployeeCompareTest o) 
	{
		if(this.empId > o.empId)
			return 1;
		if(this.empId < o.empId)
			return -1;
		return 0;
	}

	public static class NameComparator implements Comparator<EmployeeCompareTest>
	{

		@Override
		public int compare(EmployeeCompareTest o1, EmployeeCompareTest o2) {
			return o1.name.compareTo(o2.name);
		}
		
	}
	
	public String toString()
	{
		return "id: " + empId + ", name : " + name;
	}
	
	public static void main(String args[])
	{
		Set<EmployeeCompareTest> set = new TreeSet<EmployeeCompareTest>();
		set.add(new EmployeeCompareTest(10, "sangeeta"));
		set.add(new EmployeeCompareTest(9, "ravi"));
		set.add(new EmployeeCompareTest(7, "reena"));
		set.add(new EmployeeCompareTest(15, "meena"));
		set.add(new EmployeeCompareTest(17, "radha"));
		
		for(EmployeeCompareTest emp : set)
		System.out.println(emp);
		
		EmployeeCompareTest.NameComparator comparator = new EmployeeCompareTest.NameComparator();
		Set<EmployeeCompareTest> nameSet = new TreeSet<EmployeeCompareTest>(comparator);
		nameSet.addAll(set);
		for(EmployeeCompareTest emp : nameSet)
			System.out.println(emp);
	}
}
