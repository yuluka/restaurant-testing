package model;

import exceptions.NegativeNumberException;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegativeNumberException {
		if(additionalW < 0) {
			throw new NegativeNumberException(additionalW);
		}else {
			weight = weight + additionalW;
		}
	}
	
	public void removeWeight(double weightRemove) throws NegativeNumberException {
		if(weightRemove < 0) {
			throw new NegativeNumberException(weightRemove);
		}else {
			weight -= weightRemove;
		}
	}
	
}
