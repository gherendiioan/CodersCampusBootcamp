package com.coderscampus.Assignment10.dto;

public class Nutrients {
	private double calories;
	private double protein;
	private double fat;
	private double cabohydrates;

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getCabohydrates() {
		return cabohydrates;
	}

	public void setCabohydrates(double cabohydrates) {
		this.cabohydrates = cabohydrates;
	}

	@Override
	public String toString() {
		return "Nutrients [calories=" + calories + ", protein=" + protein + ", fat=" + fat + ", cabohydrates="
				+ cabohydrates + "]";
	}

}
