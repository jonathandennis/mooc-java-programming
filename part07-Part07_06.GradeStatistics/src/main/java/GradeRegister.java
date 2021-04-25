import java.util.ArrayList;

public class GradeRegister {
    
    private final ArrayList<Integer> grades;
    private final ArrayList<Integer> points;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }
    
    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
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
    
    public static int pointsToGrade(int score) {
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
    
    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }
        
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return 1.0 * sum / this.points.size();
    }
    
    public double averageOfPointsPassing() {
        if (this.points.isEmpty()) {
            return -1;
        }
        
        int sum = 0;
        int i = 0;
        for (int point : points) {
            if (point < 50) {
                continue;
            }
            sum += point;
            i++;
        }
        return 1.0 * sum / i;
    }
    
    public double percentPass() {
        if (this.points.isEmpty()) {
            return -1;
        }
        
        int pass = 0;
        for (int point : points) {
            if (point < 50) {
                continue;
            }
            pass++;
        }
        return 100.0 * pass / points.size();
    }
}
