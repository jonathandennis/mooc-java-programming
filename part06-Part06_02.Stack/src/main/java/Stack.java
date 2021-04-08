/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathandennis
 */
import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> items;
    
    public Stack() {
        this.items = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.items.isEmpty();
    }
    
    public void add(String value) {
        this.items.add(value);
    }
    
    public ArrayList<String> values() {
        return this.items;
    }
    
    public String take() {
        return this.items.remove(this.items.size() - 1);
    }
}
