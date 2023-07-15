package com.coderscampus.assignment4;

import java.io.IOException;

public class StudentService {

	Student[] students = new Student[101];

	public Student createStudent(String[] studentDetails) {

		Student student = new Student(null, null, null, null);

		student.setStudentName(studentDetails[1]);
		student.setCourseName(studentDetails[2]);
		student.setStudentID(studentDetails[0]);
		student.setStudentGrade(studentDetails[3]);

		return student;

	}

	public void extractStudentsFromFile(String fileName) throws IOException {

		ReadFromFile readFromFile = new ReadFromFile();

		String[] studentsDetails = readFromFile.readFromFileMethod();

		for (int i = 0; i < studentsDetails.length; i++) {

			students[i] = createStudent(studentsDetails[i].split(","));

		}

	}
}
