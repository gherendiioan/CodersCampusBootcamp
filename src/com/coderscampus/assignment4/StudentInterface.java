package com.coderscampus.assignment4;

import java.io.IOException;

public interface StudentInterface {

	public Student[] specificCourseArrayOfStudents(Student[] students);

	void writeToFiles(Student[] specificCourseArrayOfStudents) throws IOException;

}
