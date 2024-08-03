package com.coderscampus.Assignment10.dto;

public class Meal {

	private int id;
	private String title;
	private String imageType;
	private int readyInMinutes;
	private int servings;
	private String sourceUrl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public int getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(int readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	@Override
	public String toString() {
		return "Meal [id=" + id + ", title=" + title + ", imageType=" + imageType + ", readyInMinutes=" + readyInMinutes
				+ ", servings=" + servings + ", sourceUrl=" + sourceUrl + "]";
	}

}
