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
		assertEquals(recipe.getIngredients().get(0).getName(), "Sal");
		assertEquals(recipe.getIngredients().get(0).getWeight(), 12);
	}
	
	@Test
	void addIngredientTest2() {
		setupStage2();
		
		recipe.addIngredient("Pimienta", 6);
		int ingredientsNum = recipe.getIngredients().size();
		
		assertEquals(ingredientsNum, 4);
		assertEquals(recipe.getIngredients().get(ingredientsNum-1).getName(), "Pimienta");
		assertEquals(recipe.getIngredients().get(ingredientsNum-1).getWeight(), 6);
	}
	
	@Test
	void addIngredientTest3(){
		setupStage2();
		
		recipe.addIngredient("Ajo", 21);
		int ingredientsNum = recipe.getIngredients().size();
		
		assertEquals(ingredientsNum, 3);
		assertEquals(recipe.getIngredients().get(1).getName(), "Ajo");
		assertEquals(recipe.getIngredients().get(1).getWeight(), 79);
	}
	
	@Test
	void removeIngredientTest() {
		setupStage2();
		
		recipe.removeIngredient("Ajo");
		
		assertEquals(recipe.getIngredients().size(), 2);
		assertEquals(recipe.getIngredients().get(0).getName(), "Cebolla");
		assertEquals(recipe.getIngredients().get(1).getName(), "Arroz");
	}

}
