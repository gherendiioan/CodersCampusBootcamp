package com.coderscampus.assignment4;

import java.util.Arrays;
import java.util.Comparator;

public class SortStudentsByGrade {

	public Student[] sortedByGradeStudentsArray(Student[] students) {
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student lowerGrade, Student higherGrade) {
				if (lowerGrade == null && higherGrade == null) {
					return 0;
				}
				if (lowerGrade == null) {
					return 1;
				}
				if (higherGrade == null) {
					return -1;
				}
				return higherGrade.getStudentGrade().compareTo(lowerGrade.getStudentGrade());
			}
		});
		return students;
	}
}
