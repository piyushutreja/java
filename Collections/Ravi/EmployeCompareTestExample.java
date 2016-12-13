package com.example.listdemo;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class EmployeCompareTestExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(12, "Amit");
		Employee e2 = new Employee(10, "Ravi");
		Employee e3 = new Employee(1, "Sachin");
		Employee e4 = new Employee(100, "Nittin");

		Set<Employee> employees = new TreeSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		System.out.println(employees);
		
	}
}
