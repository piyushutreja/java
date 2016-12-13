package com.example.listdemo;


public class Customer implements Comparable<Customer> {

	private final int id;
	private final String name;

	public Customer(final int id, final String name) {

		this.id = id;
		this.name = name;
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
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Customer o) {
		if (this.id == o.id && this.name.equals(o.name)) {
			return 0;
		} else if (this.id > o.id) {
			return -1;
		} else {
			return 1;
		}
	}
}