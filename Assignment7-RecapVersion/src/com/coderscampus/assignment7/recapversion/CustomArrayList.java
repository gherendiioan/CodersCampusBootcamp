package com.coderscampus.assignment7.recapversion;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];
	int arrayIncrement = 0;

	@Override
	public boolean add(T item) {

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

		items[index] = item;
		arrayIncrement++;
		return true;
	}

	@Override
	public int getSize() {

		return arrayIncrement;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index > arrayIncrement) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		return (T) items[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index > arrayIncrement) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}

		T removedItem = (T) items[index];
		if (index < arrayIncrement - 1) {
			System.arraycopy(items, index + 1, items, index, arrayIncrement - index - 1);
		}

		arrayIncrement--;
		items[arrayIncrement] = null;
		return removedItem;
	}

}
