package com.coderscampus.assignment7;

	
	public class CustomArrayList<T> implements CustomList<T> {
		
		Object[] items = new Object[10];
		int variableArraySize;
		
		public boolean add(T item) {
			
			return add(variableArraySize, item);
		}

		private Object[] extendArraySize() {

			Object[] newArray = new Object[variableArraySize * 2];
			for (int i = 0; i < variableArraySize; i++) {
				newArray[i] = items[i];
			}
			return newArray;
		}
	
		public int getSize() {
			return variableArraySize;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public T get(int index) throws IndexOutOfBoundsException {
			
			if(index >= variableArraySize) {
				throw new IndexOutOfBoundsException("This is out of bounds");
			}
			return (T) items[index];
		}
		
		@Override
		public boolean add(int index, T item) throws IndexOutOfBoundsException {
			if (index > variableArraySize) {
				throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
			}
			if (variableArraySize == items.length) {
				items = extendArraySize();
			}
			
			for (int i = variableArraySize-1; i>=index; i--) {
				items[i+1] = items[i];
			}
			items[index] = item;
			variableArraySize++;
			return true;
			
		}

		@Override
		public T remove(int index) throws IndexOutOfBoundsException {
			if (index >= variableArraySize) {
				throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
			}
			
			@SuppressWarnings("unchecked")
			T removedItem = (T) items[index];
			
			for (int i = index; i<variableArraySize-1; i++) {
				items[i] = items[i+1];
			}
			variableArraySize--;
			return removedItem;
		}

	}


