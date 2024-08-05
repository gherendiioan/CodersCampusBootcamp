package com.coderscampus.Assignment10.dto;

import java.util.Map;

public class WeekResponseDTO {

	private Map<String, DayResponseDTO> week;
	private NutrientsDTO nutrients;

	public Map<String, DayResponseDTO> getWeek() {
		return week;
	}

	public void setWeek(Map<String, DayResponseDTO> week) {
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
