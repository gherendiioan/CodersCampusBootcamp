package com.coderscampus.loopuntilvalid.exercise.user;

public class User {
	
	
	private Integer guess;
	private String option;

	public String getOption() {
		return option;
	}


	public void setOption(String option) {
		this.option = option;
	}


	public Integer getGuess() {
		return guess;
	}

	
	public void setGuess(Integer guess) {
		this.guess = guess;
	}


	@Override
	public String toString() {
		return "User [guess=" + guess + ", option=" + option + "]";
	}
	
}
