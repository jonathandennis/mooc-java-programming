
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("First number?");
        int first = Integer.valueOf(scan.nextLine());
        System.out.print("Last number?");
        int last = Integer.valueOf(scan.nextLine());
        
        int sum = 0;
        
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
