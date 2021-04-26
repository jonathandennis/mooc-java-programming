import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private Recipe recipe;
    
    public UserInterface(Recipe recipe, Scanner scanner) {
        this.scanner = scanner;
        this.recipe = recipe;
    }
    
    public void start() {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("File to read: ");
        String file = scanner.nextLine();    
        System.out.println("");
        System.out.println("Commands: \nlist - lists the recipes\nstop - stops the program\n");        
        System.out.print("Enter Command: ");
        String command = scanner.nextLine();
     
        if (command.equals("list")) {
            try (Scanner scanFile = new Scanner(Paths.get(file))) {
                while (scanFile.hasNextLine()) {
                    String row = scanFile.nextLine();
    
                    System.out.println(row);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
