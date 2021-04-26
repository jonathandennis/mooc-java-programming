import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine(); 
        ArrayList<Recipe> recipes = readRecipesFromFile(file);
        
        System.out.println("");
        System.out.println("Commands:\n"
                        + "list - lists the recipes\n"
                        + "stop - stops the program\n"
                        + "find name - searches recipes by name\n"
                        + "find cooking time - searches recipes by cooking time\n"
                        + "find ingredient - searches recipes by ingredient"
                        );

        while (true) {
            System.out.println("");
            System.out.print("Enter Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
     
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {                
                    System.out.println(recipe);
                }
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchWord = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                
                for (Recipe recipe : recipes) {
                    if (!recipe.getName().contains(searchWord)) {
                        continue;
                    }
                    System.out.println(recipe);                    
                }
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                
                for (Recipe recipe : recipes) {
                    if(recipe.getCookTime() > maxTime) {
                        continue;
                    }
                    System.out.println(recipe);
                }
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredientSearch = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                
                for (Recipe recipe : recipes) {
                    if(!recipe.getIngredients().contains(ingredientSearch)) {
                        continue;
                    }
                    System.out.println(recipe);
                }
            }
        }
    }
    
    // Break file down by recipe(seperated by blank line), save parts(row) of each recipe on seperate list recipeParts.
    // Use the list recipeParts and module setRecipeParts to set variables and add each new recipe
    // Need last if statement to add last recipe
    public static ArrayList<Recipe> readRecipesFromFile(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> recipeParts = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    setRecipeParts(recipes, recipeParts);
                } else {
                    recipeParts.add(row);
                }
            }
            if (!recipeParts.isEmpty()) {
                setRecipeParts(recipes, recipeParts);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }
    
    // Method to set appropriate vaiables to add new Recipe
    private static void setRecipeParts(ArrayList<Recipe> recipes, ArrayList<String> recipeParts) {
        String recipeName = recipeParts.get(0);
        int cookTime = Integer.valueOf(recipeParts.get(1));
        recipeParts.remove(0);
        recipeParts.remove(0);
        recipes.add(new Recipe(recipeName, cookTime, new ArrayList<>(recipeParts)));
        recipeParts.clear();
    }
}
