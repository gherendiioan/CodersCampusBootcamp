package com.coderscampus.assignment4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class STATStudents extends Student implements StudentInterface {

	public STATStudents(String studentName, String courseName, String studentID, String studentGrade) {
		super(studentName, courseName, studentID, studentGrade);

	}

	@Override
	public Student[] specificCourseArrayOfStudents(Student[] students) {

		Student[] statStudents = new Student[101];

		for (int i = 0; i < 101; i++) {

			boolean matchFound = students[i].getCourseName().matches("[A-T ]{4} [0-9]+");

			if (matchFound && students[i] != null) {

				statStudents[i] = students[i];

			}

		}

		return statStudents;

	}

	@Override
	public void writeToFiles(Student[] specificCourseArrayOfStudents) throws IOException {
		BufferedWriter writer = null;

		try {

			writer = new BufferedWriter(new FileWriter("course2.csv"));

			writer.write("StudentID, Name, Course, Grade, \n");

			for (int i = 0; i < specificCourseArrayOfStudents.length; i++) {

				if (specificCourseArrayOfStudents[i] != null) {

					writer.write(specificCourseArrayOfStudents[i].studentCsvFormat(specificCourseArrayOfStudents));

				}
			}

		} finally {

			if (writer != null) {

				writer.close();

			}
		}

	}

}
