package com.coderscampus.Assignment10.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.dto.DayResponseDTO;
import com.coderscampus.Assignment10.dto.WeekResponseDTO;

@Service
public class MealPlanService {

	private static final Logger logger = LoggerFactory.getLogger(MealPlanService.class);

	@Value("${spoonacular.api.key}")
	private String apiKey;

	@Value("${spoonacular.urls.base}")
	private String baseUrl;

	@Value("${spoonacular.urls.mealplan}")
	private String mealPlanEndpoint;

	private final RestTemplate restTemplate;

	public MealPlanService() {
		this.restTemplate = new RestTemplate();

	}

	public DayResponseDTO getDayMeals(Integer numCalories, String diet, String exclusions) {

		String url = UriComponentsBuilder.fromHttpUrl(baseUrl + mealPlanEndpoint).queryParam("timeFrame", "day")
				.queryParam("targetCalories", numCalories).queryParam("diet", diet).queryParam("exclude", exclusions)
				.queryParam("apiKey", apiKey).toUriString();

		logger.info("fetching daily meal plan: calories = {}, diet = {}, exclusions = {}", numCalories, diet,
				exclusions);

		try {

			DayResponseDTO response = restTemplate.getForObject(url, DayResponseDTO.class);
			logger.debug("Received daily meal plan: {}", response);
			return response;
		} catch (Exception e) {
			logger.error("Error fetching daily meal plan", e);
			throw e;
		}

	}

	public WeekResponseDTO getWeekMeals(Integer numCalories, String diet, String exclusions) {
		
		String url = UriComponentsBuilder.fromHttpUrl(baseUrl + mealPlanEndpoint).queryParam("timeFrame", "week")
				.queryParam("targetCalories", numCalories).queryParam("diet", diet).queryParam("exclude", exclusions)
				.queryParam("apiKey", apiKey).toUriString();

		try {
			WeekResponseDTO response = restTemplate.getForObject(url, WeekResponseDTO.class);
			logger.debug("Received weekly meal plan: {}", response);
			return response;
		} catch (Exception e) {
			logger.error("Error fetching weekly meal plan", e);
			throw e;
		}
	}

}
