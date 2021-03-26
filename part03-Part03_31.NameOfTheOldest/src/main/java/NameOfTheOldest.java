
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestname = "";
        
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            String name = parts[0];
            
            if (age > oldest) {
                oldest = age;
                oldestname = name;
            }
        }
        System.out.println("Name of the oldest: " + oldestname);
    }
}
