package com.coderscampus.assignment4.recapversion;

public class COMPSCI extends Student{
	
	private String name;
	private int ID;
	private String course;
	private int grade;
	
	

	public COMPSCI(String course, String name, int iD, int grade) {
		super(course);
		this.name = name;
		ID = iD;
		this.grade = grade;
	}



	@Override
	public String toString() {
		return "COMPSCI [name=" + name + ", ID=" + ID + ", course=" + course + ", grade=" + grade + "]";
	}

		

}
