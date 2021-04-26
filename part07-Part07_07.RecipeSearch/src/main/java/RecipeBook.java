import java.util.ArrayList;

public class RecipeBook {
    
    private ArrayList<Recipe> recipes;
    
    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
} 
