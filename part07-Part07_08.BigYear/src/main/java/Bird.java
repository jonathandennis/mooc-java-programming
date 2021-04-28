public class Bird {
    private String name;
    private String latinName;    
    private int observed;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        observed = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void observeBird() {
        this.observed++;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + latinName + "): " + observed + " observations";
    }
}
