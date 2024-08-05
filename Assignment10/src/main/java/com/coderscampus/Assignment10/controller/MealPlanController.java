package com.coderscampus.Assignment10.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.dto.DayResponseDTO;
import com.coderscampus.Assignment10.dto.WeekResponseDTO;
import com.coderscampus.Assignment10.service.MealPlanService;

@RestController
public class MealPlanController {
	
	private static final Logger logger = LoggerFactory.getLogger(MealPlanController.class);
	
	@Autowired
	private MealPlanService mealPlanService;
	
	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponseDTO> getDayMeals(
			@RequestParam(required = false) Integer numCalories,
			@RequestParam(required = false) String diet,
			@RequestParam(required = false) String exclusions){
		logger.info("GET /mealplanner/day - numCalories={}, diet={}, exclusions={}",
				numCalories, diet, exclusions);
		
		DayResponseDTO response = mealPlanService.getDayMeals(numCalories, diet, exclusions);
		return ResponseEntity.ok(response);

	}
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponseDTO> getWeekMeals(
			@RequestParam(required = false) Integer numCalories,
			@RequestParam(required = false) String diet,
			@RequestParam(required = false) String exclusions){
		logger.info("GET /mealplanner/week - numCalories={}, diet={}, exclusions={}",
				numCalories, diet, exclusions);
		
		WeekResponseDTO response = mealPlanService.getWeekMeals(numCalories, diet, exclusions);
		return ResponseEntity.ok(response);
		
	}

}
