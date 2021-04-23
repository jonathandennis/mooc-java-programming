import java.util.ArrayList;

public class GradeRegister {
    
    private ArrayList<Integer> grades;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
    }
    
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }
    
    public static int pointsToGrades(int score) {
        int grade = 0;
            if (score < 50) {
                grade = 0;
            } else if (score < 60) {
                grade = 1;
            } else if (score < 70) {
                grade = 2;
            } else if (score < 80) {
                grade = 3;
            } else if (score < 90) {
                grade = 4;
            } else {
                grade = 5;
            }
            
            return grade;
    }
}
