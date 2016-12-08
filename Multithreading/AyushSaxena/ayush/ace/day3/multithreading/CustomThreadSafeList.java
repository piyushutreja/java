package ayush.ace.day3.multithreading;

import java.util.ArrayList;

public class CustomThreadSafeList<E extends Object> {

	Object[] arr;

	int size;
	int load;
	int index;

	CustomThreadSafeList(int size) {

		this.size = size;

		arr = new Object[size];

		load = 0;

		index = 0;

	}

	public void add(E element) {

		/*
		 * System.out.println("Added element is " + element);
		 * 
		 * System.out.println("Array is " + arr[0] + " " + arr[1])
		 */;
		while (true) {

			synchronized (arr) {
				if ((index + 1) < size) {
					arr[index++] = element;
					// System.out.println("value added " + arr[index]);
					load++;
					arr.notify();
					break;
				} else {
					try {
						arr.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

	public synchronized E remove() {

		E temp = null;

		while (true) {

			synchronized (arr) {

				if (load != 0 && load != size) {
					temp = (E) arr[--index];
					arr[index] = null;
					load--;
					arr.notify();
					break;

				} else {

					try {
						synchronized (arr) {
							arr.wait();
						}

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}
		return temp;

	}

}
