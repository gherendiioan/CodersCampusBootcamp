package com.coderscampus.assignment7.recapversion;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int arrayIncrement = 0;

	@Override
	public boolean add(T item) {
//		items = (arrayIncrement == items.length) ? increaseArray(): items;
//		
//		items[arrayIncrement] = item;
//		arrayIncrement++;

		return add(arrayIncrement, item);
	}

	private Object[] increaseArray() {
		Object[] increasedArray = new Object[arrayIncrement * 2];

		for (int i = 0; i < arrayIncrement; i++) {
			increasedArray[i] = items[i];
		}

		return increasedArray;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index > arrayIncrement || index < 0) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		
		items = (arrayIncrement == items.length) ? increaseArray() : items;
		
		
		System.arraycopy(items, index, items, index + 1, arrayIncrement - index);
//		for (int i = arrayIncrement - 1; i >= index; i--) {
////			items[i+1] = (arrayIncrement == items.length) ? increaseArray(): items[i];
//			items[i + 1] = items[i];
//		}

		items[index] = item;
		arrayIncrement++;
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

}
