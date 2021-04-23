import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        GradeRegister register = new GradeRegister();
        
        System.out.println("Enter point totals, -1 stops:");
        
        int pointTotal = 0;
        int passingTotal = 0;
        int i = 0;
        int iPass = 0;
        
        while (true) {
            int score = Integer.valueOf(scanner.nextLine());
            
            if (score == -1) {
                break;
            }
            
            if (score < 0 || score > 100) {
                continue;
            }
            
            if (score >= 50) {
                passingTotal += score;
                iPass++;
            }
            
            pointTotal += score;
            i++;
            
            register.addGradeBasedOnPoints(score);
        } 
        
        System.out.println("Point average (all): " + (1.0 * pointTotal / i));
        if (passingTotal == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + (1.0 * passingTotal / iPass));
        }
        System.out.println("Pass percentage: " + 100.0 * iPass / i);
        System.out.println("Grade distribution:");
        
        int grade = 5;
        while (grade >=0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            while (stars > 0) {
                System.out.print("*");
                stars--;
            }
            System.out.println("");
            grade--;
        }
    }
}
