package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.NegativeNumberException;

class IngredientTest {

	private Ingredient ingredient;
	
	public void setupStage1() {
		ingredient = new Ingredient("Tomate", 245);
	}
	
	
	@Test
	void addWeightTest() {
		setupStage1();
		ingredient.addWeight(54);
		
		assertEquals(299, ingredient.getWeight());
	}
	
	@Test
	void addWeightExceptionTest() {
		setupStage1();
		
		boolean exceptionThrown = false;
		try{
			ingredient.addWeight(-100);
		}catch(NegativeNumberException e) {
			exceptionThrown = true;
			e.printStackTrace();
		}
		
		assertTrue(exceptionThrown);
	}
	
	@Test
	void removeWeigthTest() {
		setupStage1();
		ingredient.removeWeight(45);
		
		assertEquals(200, ingredient.getWeight());
	}
	
	@Test
	void removeWeightExceptionTest() {
		setupStage1();
		
		boolean exceptionThrown = false;
		try {
			ingredient.removeWeight(-100);
		} catch (NegativeNumberException e) {
			exceptionThrown = true;
			e.printStackTrace();
		}
		
		assertTrue(exceptionThrown);
	}

}
