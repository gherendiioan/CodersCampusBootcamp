package com.coderscampus.assignment4;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		
		String fileName = "student-master-list.csv";
		

		StudentService studentService = new StudentService();
		COMPSCIStudents compSciStudents = new COMPSCIStudents(null, null, null, null);
		STATStudents statStudents = new STATStudents(null, null, null, null);
		APMTHStudents apmthsStudents = new APMTHStudents(null, null, null, null);
		SortStudentsByGrade sortStudents = new SortStudentsByGrade();
		
		studentService.extractStudentsFromFile(fileName);
		
				
		Student[] compSciStudentsArray = compSciStudents.specificCourseArrayOfStudents(studentService.students);		
		sortStudents.sortedByGradeStudentsArray(compSciStudentsArray);
		
		Student[] statStudentsArray = statStudents.specificCourseArrayOfStudents(studentService.students);		
		sortStudents.sortedByGradeStudentsArray(statStudentsArray);
		
		Student[] apmthStudentsArray = apmthsStudents.specificCourseArrayOfStudents(studentService.students);
		sortStudents.sortedByGradeStudentsArray(apmthStudentsArray);
		
		
		compSciStudents.writeToFiles(compSciStudentsArray);
		statStudents.writeToFiles(statStudentsArray);
		apmthsStudents.writeToFiles(apmthStudentsArray);
		
		
	}

}
