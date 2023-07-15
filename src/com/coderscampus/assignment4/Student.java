package com.coderscampus.assignment4;

public class Student {

	private String studentName;
	private String courseName;
	private String studentID;
	private String studentGrade;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public Student(String studentName, String courseName, String studentID, String studentGrade) {

		this.studentName = studentName;
		this.courseName = courseName;
		this.studentID = studentID;
		this.studentGrade = studentGrade;

	}

	public String studentCsvFormat(Student[] specificCourseArrayOfStudents) {

		String studentCsvFormat = getStudentID() + "," + getStudentName() + "," + getCourseName() + ","
				+ getStudentGrade() + "\n";

		return studentCsvFormat;
	}

}
