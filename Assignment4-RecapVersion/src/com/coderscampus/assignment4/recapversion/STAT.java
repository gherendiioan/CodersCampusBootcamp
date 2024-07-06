package com.coderscampus.assignment4.recapversion;

public class STAT extends Student {

	private int ID;
	private String name;
	private int grade;

	public STAT(String course, int iD, String name, int grade) {
		super(course);
		ID = iD;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "STAT [ID=" + ID + ", name=" + name + ", grade=" + grade + ", course=" + course + "]";
	}

}
