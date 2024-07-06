package com.coderscampus.assignment4.recapversion;

public class COMPSCI extends Student {

	private int ID;
	private String name;
	private int grade;

	public COMPSCI(String course, String name, int iD, int grade) {
		super(course);
		ID = iD;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "COMPSCI [ID=" + ID + ", name=" + name + ", grade=" + grade + ", course=" + course + "]";
	}

}
