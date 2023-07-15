package com.coderscampus.assignment7;


	public interface CustomList<T> {
		/**
		 * This method should add a new item into the <code>CustomList</code> and should
		 * return <code>true</code> if it was successfully able to insert an item.
		 * @param item the item to be added to the <code>CustomList</code>
		 * @return <code>true</code> if item was successfully added, <code>false</code> if the item was not successfully added (note: it should always be able to add an item to the list) 
		 *
		 */
		boolean add (T item);
		
		/**
		 * This method should add a new item into the <code>CustomList</code> at the 
		 * specified index (thus shuffling the other items to the right). If the index doesn't
		 * yet exist, then you should throw an <code>IndexOutOfBoundsException</code>. 
		 * @param index the spot in the zero-based array where you'd like to insert your
		 *        new item
		 * @param item the item that will be inserted into the <code>CustomList</code>
		 * @return <code>true</code> when the item is added
		 * @throws IndexOutOfBoundsException
		 */
		boolean add (int index, T item) throws IndexOutOfBoundsException;
		
		/**
		 * This method should return the size of the <code>CustomList</code>
		 * based on the number of actual elements stored inside of the <code>CustomList</code>
		 * @return an <code>int</code> representing the number of elements stored in the <code>CustomList</code>
		 */
		int getSize();
		
		/**
		 * This method will return the actual element from the <code>CustomList</code> based on the
		 * index that is passed in.
		 * @param index represents the position in the backing <code>Object</code> array that we want to access
		 * @return The element that is stored inside of the <code>CustomList</code> at the given index
		 * @throws IndexOutOfBoundsException
		 */
		T get(int index) throws IndexOutOfBoundsException;
		
		/**
		 * This method should remove an item from the <code>CustomList</code> at the 
		 * specified index. This will NOT leave an empty <code>null</code> where the item
		 * was removed, instead all other items to the right will be shuffled to the left.
		 * @param index the index of the item to remove
		 * @return the actual item that was removed from the list
		 * @throws IndexOutOfBoundsException
		 */
		T remove(int index) throws IndexOutOfBoundsException;
	}
	

