import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Recipe recipe = new Recipe();
         
         UserInterface ui = new UserInterface(recipe, scanner);
         ui.start();
    }

}
