package com.coderscampus.assignment4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class COMPSCIStudents extends Student implements StudentInterface {

	public COMPSCIStudents(String studentName, String courseName, String studentID, String studentGrade) {
		super(studentName, courseName, studentID, studentGrade);

	}

//	StudentService studentService = new StudentService();

	public Student[] specificCourseArrayOfStudents(Student[] students) {
		Student[] compSciStudents = new Student[101];

		for (int i = 0; i < 101; i++) {

			boolean matchFound = students[i].getCourseName().matches("[C-S ]+[0-9]+");

			if (matchFound && students[i] != null) {

				compSciStudents[i] = students[i];

			}

		}

		return compSciStudents;

	}

	@Override
	public void writeToFiles(Student[] specificCourseArrayOfStudents) throws IOException {
		BufferedWriter writer = null;

		try {

			writer = new BufferedWriter(new FileWriter("course1.csv"));

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
