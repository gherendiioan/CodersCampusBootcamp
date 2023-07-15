package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public String[] readFromFileMethod() throws IOException {

		BufferedReader readFromFileVar = null;
		String[] arrayOfStudents = null;

		try {

			readFromFileVar = new BufferedReader(new FileReader("student-master-list.csv"));

			int lineIndex = 0;
			String fileLine = null;
			arrayOfStudents = new String[101];

			while ((fileLine = readFromFileVar.readLine()) != null) {

				arrayOfStudents[lineIndex] = fileLine;
				lineIndex++;

			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

		return arrayOfStudents;

	}

}
