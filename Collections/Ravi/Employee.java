package com.example.listdemo;

public class Employee implements Comparable<Employee> {

	private final int id;
	private final String name;

	public Employee(final int id, final String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id == o.id && this.name.equals(o.name)) {
			return 0;
		} else if (this.id > o.id) {
			return -1;
		} else {
			return 1;
		}
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
