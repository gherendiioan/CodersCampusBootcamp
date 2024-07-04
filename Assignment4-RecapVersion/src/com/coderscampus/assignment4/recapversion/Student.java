package com.coderscampus.assignment4.recapversion;

public abstract class Student {
	
	protected int ID;
	protected String name;
	protected String course;
	protected int grade;
	
	public Student() {
		
	}
	
	
	public Student(String course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", course=" + course + ", grade=" + grade + "]";
	}
	
	
	
}
