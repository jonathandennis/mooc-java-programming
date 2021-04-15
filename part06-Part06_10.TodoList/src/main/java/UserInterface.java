import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList tasks;
    
    public UserInterface(TodoList tasks, Scanner scanner) {
        this.scanner = scanner;
        this.tasks = tasks;
    }
    
    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            processCommand(input);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")){
            remove();
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        this.tasks.add(task);
    }
    
    public void list() {
        this.tasks.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int finished = Integer.valueOf(scanner.nextLine());
        this.tasks.remove(finished);
    }
}
