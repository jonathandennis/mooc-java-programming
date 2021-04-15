import java.util.ArrayList;

public class Suitcase {
    
    private int maxWeight;   
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() > this.maxWeight) {
            return;
        }
        this.items.add(item);
    }
    
    public int totalWeight() {        
        int sum = 0;        
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }
    
    public void printItems() {       
        for (Item item : this.items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    @Override
    
    public String toString() {
        
        if (items.isEmpty()) {
            return "no items (0kg)";
        }
        
        if (items.size() == 1) {
            return "1 item (" + this.totalWeight() + "kg)";
        }
        
        return items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
}  