import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    
    private ArrayList<Suitcase> cases;
    
    public Hold(int maxWeight) {
        this.cases = new ArrayList<>();
        this.maxWeight = maxWeight;        
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() > maxWeight) {
            return;
        }
        this.cases.add(suitcase);
    }
    
    public int totalWeight() {        
        int sum = 0;        
        for (Suitcase suitcase : cases) {
            sum += suitcase.totalWeight();
        }
        return sum;
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.cases) {            
            suitcase.printItems();
        }
    }
    
    public String toString() {
        
        if (this.cases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        if (this.cases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg";
        }
        
        return this.cases.size() + " suitcases (" + this.totalWeight() + " kg)"; 
    }
}
