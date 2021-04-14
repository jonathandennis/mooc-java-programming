import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int sumOfWeights;
    
    private ArrayList<Suitcase> cases;
    
    public Hold(int maxWeight) {
        this.cases = new ArrayList<>();
        this.maxWeight = maxWeight;
        sumOfWeights = 0;
        
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (maxWeight >= suitcase.totalWeight() + sumOfWeights) {
            this.cases.add(suitcase);
            sumOfWeights += suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.cases) {            
            suitcase.printItems();
        }
    }
    
    public String toString() {
        return this.cases.size() + " suitcases (" + sumOfWeights + " kg)"; 
    }
}
