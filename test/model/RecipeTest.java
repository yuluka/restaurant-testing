package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {

	private Recipe recipe;
	
	public void setupStage1() {
		recipe = new Recipe();
	}
	
	public void setupStage2() {
		recipe = new Recipe();
		
		recipe.addIngredient("Cebolla", 315);
		recipe.addIngredient("Ajo", 58);
		recipe.addIngredient("Arroz", 520);
	}
	
	
	@Test
	void addIngredientTest() {
		setupStage1();
		
		recipe.addIngredient("Sal", 12);
		
		assertEquals(1, recipe.getIngredients().size());
		assertEquals("Sal", recipe.getIngredients().get(0).getName());
		assertEquals( 12, recipe.getIngredients().get(0).getWeight());
	}
	
	@Test
	void addIngredientTest2() {
		setupStage2();
		
		recipe.addIngredient("Pimienta", 6);
		int ingredientsNum = recipe.getIngredients().size();
		
		assertEquals(4, ingredientsNum);
		assertEquals("Pimienta", recipe.getIngredients().get(ingredientsNum-1).getName());
		assertEquals(6, recipe.getIngredients().get(ingredientsNum-1).getWeight());
	}
	
	@Test
	void addIngredientTest3(){
		setupStage2();
		
		recipe.addIngredient("Ajo", 21);
		int ingredientsNum = recipe.getIngredients().size();
		
		assertEquals(3, ingredientsNum);
		assertEquals("Ajo", recipe.getIngredients().get(1).getName());
		assertEquals(79, recipe.getIngredients().get(1).getWeight());
	}
	
	@Test
	void removeIngredientTest() {
		setupStage2();
		
		recipe.removeIngredient("Ajo");
		
		assertEquals(2, recipe.getIngredients().size());
		assertEquals("Cebolla", recipe.getIngredients().get(0).getName());
		assertEquals("Arroz", recipe.getIngredients().get(1).getName());
	}

}
