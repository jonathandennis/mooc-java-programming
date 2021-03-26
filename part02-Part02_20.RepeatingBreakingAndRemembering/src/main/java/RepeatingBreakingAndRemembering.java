
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
               
        while (true) {            
            int num = Integer.valueOf(scan.nextLine());
            
            if (num == -1) {
                break;
            }
            
            sum += num;
            numbers++;
            
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (1.0 * sum / numbers));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
