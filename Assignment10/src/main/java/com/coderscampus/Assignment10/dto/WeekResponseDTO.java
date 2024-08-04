package com.coderscampus.Assignment10.dto;

import java.util.List;
import java.util.Map;

public class WeekResponseDTO {

	private Map<String, List<MealDTO>> week;
	private NutrientsDTO nutrients;

	public Map<String, List<MealDTO>> getWeek() {
		return week;
	}

	public void setWeek(Map<String, List<MealDTO>> week) {
		this.week = week;
	}

	public NutrientsDTO getNutrients() {
		return nutrients;
	}

	public void setNutrients(NutrientsDTO nutrients) {
		this.nutrients = nutrients;
	}

	@Override
	public String toString() {
		return "WeekResponseDTO [week=" + week + ", nutrients=" + nutrients + "]";
	}
	
	

}
