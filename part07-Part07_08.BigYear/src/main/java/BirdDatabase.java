import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public boolean observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.observeBird();
                return true;
            }
        }
        return false;
    }
    
    public void add(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }
    
    public String getOne(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return bird.toString();
            }
        }
        return null;
    }
    
    public String getAll() {
        String allBirds = "";
        for (Bird bird : birds) {
            allBirds += bird.toString();
        }
        return allBirds;
    }
}
