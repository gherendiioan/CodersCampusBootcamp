package com.coderscampus.assignment5;

public class CustomArrayList<T> implements CustomList<T> {
	
	Object[] items = new Object[10];
	int variableSizeToBeIncreased = 0;

	@Override
	public boolean add(T item) {

		if (variableSizeToBeIncreased == items.length) {
			
			items = extendArraySize();
			
		}
		
		items[variableSizeToBeIncreased] = item;
		variableSizeToBeIncreased++;
		
		return true;
		
	}

	private Object[] extendArraySize() {

		Object[] newArray = new Object[variableSizeToBeIncreased * 2];
		
		for (int i = 0; i < variableSizeToBeIncreased; i++) {
			
			newArray[i] = items[i];
			
		}
		
		return newArray;
		
	}

	@Override
	public int getSize() {
		
		return variableSizeToBeIncreased;
		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		
		return (T) items[index];
		
	}

}
