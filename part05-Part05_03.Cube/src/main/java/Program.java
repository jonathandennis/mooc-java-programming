
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        System.out.print("Enter length of edge: ");
        int edge = Integer.valueOf(scanner.nextLine());
        
        Cube first = new Cube(edge);
        System.out.println(first);
    }
}
