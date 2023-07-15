package com.coderscampus.assignment6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FileService {

	public List<TeslaSales> readFromFile(String filename) throws IOException {

		List<TeslaSales> teslaSales = new ArrayList<>();

		BufferedReader bufferedReader = null;

		try {
			bufferedReader = new BufferedReader(new FileReader(filename));
			
			String line = bufferedReader.readLine();
			
			while ((line = bufferedReader.readLine()) != null) {
				String[] fileData = line.split(",");
				teslaSales.add(new TeslaSales(fileData[0], fileData[1]));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {

			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
		return teslaSales;
	}

	public void showReport(List<TeslaSales> carSalesData, String modelType) {

		System.out.println(modelType + " Yearly Sales Report");
		System.out.println("-----------------------------");

		Map<Integer, List<TeslaSales>> yearlyData = carSalesData.stream()
				.collect(Collectors.groupingBy(yd -> yd.getDate().getYear()));

		String totalYearlySales = yearlyData.entrySet().stream()
				.map(ym -> ym.getKey() + " -> "
						+ ym.getValue().stream()
									   .collect(Collectors.summingInt(TeslaSales::getSales)))
				            		   .collect(Collectors.joining("\n"));

		System.out.println(totalYearlySales);
		System.out.println("");

		Optional<TeslaSales> maxSalesData = carSalesData.stream()
				.max((TeslaSales o1, TeslaSales o2) -> o1.getSales().compareTo(o2.getSales()));
		Optional<TeslaSales> minSalesData = carSalesData.stream()
				.min((TeslaSales o1, TeslaSales o2) -> o1.getSales().compareTo(o2.getSales()));

		System.out.println("The best month for " + modelType + " was: "
				+ maxSalesData.orElse(new TeslaSales("Jan-70", "0")).getDate());
		System.out.println("The worst month for " + modelType + " was: "
				+ minSalesData.orElse(new TeslaSales("Jan-70", "0")).getDate());
		
		System.out.println("");

	}

}
