package com.coderscampus.Assignment10.dto;

import java.util.List;

public class DayResponseDTO {

	private List<MealDTO> meals;
	private NutrientsDTO nutrients;

	public List<MealDTO> getMeals() {
		return meals;
	}

	public void setMeals(List<MealDTO> meals) {
		this.meals = meals;
	}

	public NutrientsDTO getNutrients() {
		return nutrients;
	}

	public void setNutrients(NutrientsDTO nutrients) {
		this.nutrients = nutrients;
	}

	@Override
	public String toString() {
		return "DayResponse [meals=" + meals + ", nutrients=" + nutrients + "]";
	}

}
