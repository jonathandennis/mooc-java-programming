import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookTime) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = new ArrayList<>();
    }
    
    public boolean cookingTimeAtMost(int max) {
        return this.cookTime <= max;
    }
    
    public boolean nameContains(String searchName) {
        return this.name.contains(searchName);
    }
    
    public boolean containsIngredient(String ingredient) {
        return this.ingredients.contains(ingredient);
    }
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + cookTime; 
    }
}
