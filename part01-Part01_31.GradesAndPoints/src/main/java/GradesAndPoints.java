
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int g = Integer.valueOf(scan.nextLine());
        if (g < 0) {
            System.out.println("Grade: impossible!");
        } else if (g < 50) {
            System.out.println("Grade: failed");
        } else if (g < 60) {
            System.out.println("Grade: 1");
        } else if (g < 70) {
            System.out.println("Grade: 2");
        } else if (g < 80) {
            System.out.println("Grade: 3");
        } else if (g < 90) {
            System.out.println("Grade: 4");
        } else if (g <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}
