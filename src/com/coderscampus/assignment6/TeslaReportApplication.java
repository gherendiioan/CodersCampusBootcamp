package com.coderscampus.assignment6;

import java.io.IOException;
import java.util.List;

public class TeslaReportApplication {

	public static void main(String[] args) throws IOException {

		FileService fileService = new FileService();

		List<TeslaSales> model3Sales = fileService.readFromFile("model3.csv");
		List<TeslaSales> modelSSales = fileService.readFromFile("modelS.csv");
		List<TeslaSales> modelXSales = fileService.readFromFile("modelX.csv");

		fileService.showReport(model3Sales, "Model 3");
		fileService.showReport(modelSSales, "Model S");
		fileService.showReport(modelXSales, "Model X");

	}

}
