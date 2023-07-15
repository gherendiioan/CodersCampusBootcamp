package com.whatifitsdifferent.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	String[] fileReadingMethod() throws IOException {

		BufferedReader fileReaderVar = null;
		try {
			fileReaderVar = new BufferedReader(new FileReader("data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		String[] fileResources = new String[4];
		fileResources[0] = fileReaderVar.readLine();
		fileResources[1] = fileReaderVar.readLine();
		fileResources[2] = fileReaderVar.readLine();
		fileResources[3] = fileReaderVar.readLine();
		
		return fileResources;
		
		
	}
		


}
