package com.coderscampus.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.coderscampus.assignment7.CustomArrayList;
import com.coderscampus.assignment7.CustomList;

class CustomArrayListTest {

	private CustomList<Integer> sut;

	@BeforeEach
	void run_before_each_test() {
		
		sut = new CustomArrayList<>();
		for (int i = 0; i < 20; i++) {
			sut.add(i + 1);
		}
	}
	
	
	
	@Test
	void should_add_into_beginning_of_arraylist() {

		sut.add(0, -8);

		assertEquals(-8, sut.get(0));
		assertEquals(1, sut.get(1));
		assertEquals(21, sut.getSize());
		                          
		
	}
	
	

	@Test
	void should_add_into_middle_of_arraylist() {

		sut.add(9, 100);
		
		assertEquals(100, sut.get(9));
		assertEquals(21, sut.getSize());
		
		
	}
	
	

	@Test
	void should_add_into_end_of_arraylist() {
		sut.add(20, -5);

		assertEquals(-5, sut.get(20));
		assertEquals(21, sut.getSize());
	}
	
	

	@Test
	void should_remove_from_beginning_of_arraylist() {
		Integer itemRemoved = sut.remove(0);

		assertEquals(1, itemRemoved);
		assertEquals(19, sut.getSize());
		assertEquals(2, sut.get(0));
		assertEquals(20, sut.get(sut.getSize() - 1));
		
		
	}
	
	

	@Test
	void should_remove_from_middle_of_arraylist() {
		
		
		Integer itemRemoved = sut.remove(9);
		
		assertEquals(10, itemRemoved);
		assertEquals(19, sut.getSize());
		assertEquals(1, sut.get(0));
		assertEquals(20, sut.get(sut.getSize() - 1));
		
		
	}

	

	@Test
	void should_remove_from_end_of_arraylist() {
		Integer itemRemoved = sut.remove(19);

		assertEquals(20, itemRemoved);
		assertEquals(19, sut.getSize());
		assertEquals(1, sut.get(0));
		assertEquals(19, sut.get(sut.getSize() - 1));
		
	}
	
	

	@Test
	void should_throw_exception_when_getting_out_of_bounds() {
		try {
			sut.get(20);
			fail("Expected an IndexOutOfBoundsException but did not get one.");
		} catch (IndexOutOfBoundsException e) {
			return;
		}
		fail("Expected an IndexOutOfBoundsException but did not get one.");

	}
	
	

	@Test
	void should_throw_exception_when_removing_out_of_bounds() {
		try {
			sut.remove(20);
			fail("Expected an IndexOutOfBoundsException but did not get one.");
		} catch (IndexOutOfBoundsException e) {
			return;
		}
		fail("Expected an IndexOutOfBoundsException but did not get one.");

	}
	
	
	
	@Test
	void should_throw_exception_when_adding_out_of_bounds() {
		try {
			sut.add(21, -5);
			fail("Expected an IndexOutOfBoundsException but did not get one.");
		} catch (IndexOutOfBoundsException e) {
			return;
		}
		fail("Expected an IndexOutOfBoundsException but did not get one.");

	}

}
