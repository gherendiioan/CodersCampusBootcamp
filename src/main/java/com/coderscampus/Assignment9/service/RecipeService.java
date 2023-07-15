package com.coderscampus.Assignment9.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVFormat.Builder;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Assignment9.RecipeRepository.RecipeRepository;
import com.coderscampus.Assignment9.domain.Recipe;

@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	public List<Recipe> ingestRecipes () {
		
		//Create the builder for CSVFormat		
		Builder csvFormat = CSVFormat.Builder
				.create()
				.setIgnoreSurroundingSpaces(true)
				.setDelimiter(',')
				.setEscape('\\')
				.setHeader("Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes", "Price Per Serving","Ready In Minutes","Servings","Spoonacular Score","Title","Vegan","Vegetarian")
				.setSkipHeaderRecord(true);
		
		//Use the builder previously created 
		CSVFormat csvFormatForParsing = csvFormat.build();
		
		//Iterate through the records found in the file based on the construct of the builder
		try (Reader in = new FileReader("recipes.txt")) 
		{
		
			Iterable<CSVRecord> records =  csvFormatForParsing.parse(in);
			for (CSVRecord record : records) {
				Integer cookingMinutes = Integer.parseInt(record.get("Cooking Minutes"));
				Boolean dairyFree = Boolean.parseBoolean(record.get("Dairy Free"));
				Boolean glutenFree = Boolean.parseBoolean(record.get("Gluten Free"));
				String instructions = record.get("Instructions");
				String prepMins = record.get("Preparation Minutes");
				Double preparationMinutes = Double.parseDouble(prepMins);
				/* Maybe because I copied the text from the file (instead of copying the file) I couldn't parse it in a more elegant way (as far as I know).*/
//				Double preparationMinutes = Double.parseDouble("Preparation Minutes");
				String price = record.get("Price Per Serving");
				Double pricePerServing = Double.parseDouble(price);
//				Double pricePerServing = Double.parseDouble("Price Per Serving");
				String rdyInMinutes = record.get("Ready In Minutes");
				Integer readyInMinutes = Integer.parseInt(rdyInMinutes);
//				Integer readyInMinutes = Integer.parseInt("Ready In Minutes");
				String svings = record.get("Servings");
				Integer servings = Integer.parseInt(svings);
//				Integer servings = Integer.parseInt("Servings");
				String score = record.get("Spoonacular Score");
				Double spoonacularScore = Double.parseDouble(score);
//				Double spoonacularScore = Double.parseDouble("Spoonacular Score");
				String title = record.get("Title");
				String vGun = record.get("Vegan");
				Boolean vegan = Boolean.parseBoolean(vGun);
				String vegetrian = record.get("Vegetarian");
				Boolean vegetarian = Boolean.parseBoolean(vegetrian);
				
				//Initialize the Recipe and populate the data
				Recipe recipe = new Recipe();
				recipe.setCookingMinutes(cookingMinutes);
				recipe.setDairyFree(dairyFree);
				recipe.setGlutenFree(glutenFree);
				recipe.setInstructions(instructions);
				recipe.setPreparationMinutes(preparationMinutes);
				recipe.setPricePerServing(pricePerServing);
				recipe.setReadyInMinutes(readyInMinutes);
				recipe.setServings(servings);
				recipe.setSpoonacularScore(spoonacularScore);
				recipe.setTitle(title);
				recipe.setVegan(vegan);
				recipe.setVegetarian(vegetarian);
				
				//After populating the data add the recipe to the repository
				recipeRepository.getRecipes().add(recipe);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return recipeRepository.getRecipes();
								
	}
	
	public List<Recipe> getAllRecipes(){
		
		if(recipeRepository.getRecipes().size() == 0) {
			return ingestRecipes();
		}
		
		return recipeRepository.getRecipes();
		
	}
	

}
