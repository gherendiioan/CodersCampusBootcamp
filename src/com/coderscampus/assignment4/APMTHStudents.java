package com.coderscampus.assignment4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class APMTHStudents extends Student implements StudentInterface {

	public APMTHStudents(String studentName, String courseName, String studentID, String studentGrade) {
		super(studentName, courseName, studentID, studentGrade);

	}

	@Override
	public Student[] specificCourseArrayOfStudents(Student[] students) {

		Student[] apmthStudents = new Student[101];

		for (int i = 0; i < 100; i++) {

			boolean matchFound = students[i].getCourseName().matches("[A-T ]{5} [0-9]+");

			if (matchFound && students[i] != null) {

				apmthStudents[i] = students[i];

			}

		}

		return apmthStudents;

	}

	@Override
	public void writeToFiles(Student[] specificCourseArrayOfStudents) throws IOException {
		BufferedWriter writer = null;

		try {

			writer = new BufferedWriter(new FileWriter("course3.csv"));

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
