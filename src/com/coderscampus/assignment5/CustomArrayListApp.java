package com.coderscampus.assignment5;

public class CustomArrayListApp {

	public static void main(String[] args) {
		CustomList<Integer> numbers = new CustomArrayList<>();
		
		for (int i=1; i<=121; i++) {
			
			numbers.add(i);
			
		}
		
		for (int i=0; i<numbers.getSize(); i++) {
			
			System.out.println(numbers.get(i));
			
		}

	}

}
