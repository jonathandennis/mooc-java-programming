
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        //this.count = numberCount;
        this.count = count;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        sum = sum + number;
        count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (count == 0) {
            return 0.0;
        }
        return 1.0 * sum / count;
    }
}
