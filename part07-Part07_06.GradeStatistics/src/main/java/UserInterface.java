import java.util.Scanner;

public class UserInterface {
    
    private GradeRegister register;
    private Scanner scanner;
    
    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        readPoints();
        printGradeDistribution();
    }
    
    public void readPoints() {
        while (true) {
            int score = Integer.valueOf(scanner.nextLine());
            
            if (score == -1) {
                break;
            }
            
            if (score < 0 || score > 100) {
                continue;
            }

            register.addGradeBasedOnPoints(score);
        } 
    }
    
    public void printGradeDistribution() {
        System.out.println("Point average (all): " + register.averageOfPoints());
        if (register.percentPass() > 0) {
            System.out.println("Point average (passing): " + register.averageOfPointsPassing());
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + register.percentPass());
        System.out.println("Grade distribution:");
        
        int grade = 5;
        while (grade >=0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");
            grade--;
        }
    }
    
    public static void printsStars(int stars) {
        while (stars > 0) {
                System.out.print("*");
                stars--;
            }
    }
}
