package com.ace.custom.producer.comsumer;

public class CustomList<T> 
{

	Object[] arr;
	int capacity = 10;
	int size = 0;
	
	CustomList()
	{
		arr = new Object[capacity];
	}
	
	CustomList(int capacity)
	{
	   this.capacity = capacity;
	   arr = new Object[capacity];
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index)
	{
		return (T)arr[index];
	}
	
	public void add(T t)
	{
		if(size == capacity)
		{
			capacity = 3*capacity/2;
			Object[] tempArr = new Object[capacity];
			for(int i = 0; i < size; i++)
			{
				tempArr[i] = arr[i];
			}
			arr = tempArr;
		}
		
		arr[size] = t;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public T remove(int index)
	{
		T val = (T) arr[index];
		
		for(int i=index; i < size-1; i++)
		{
			arr[i] = arr[i+1];
		}
		
		arr[size-1] = null;
		size--;
		return val;
	}
	
	public int size()
	{
		return size;
	}
	
	public String toString()
	{
		StringBuilder str = new StringBuilder("[");
		for(int i =0; i < size; i++)
			str.append(arr[i].toString() + ", ");
		str.append("]");
		
		return str.toString();
	}
}
