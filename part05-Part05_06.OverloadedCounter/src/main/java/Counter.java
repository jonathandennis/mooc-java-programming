/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathandennis
 */
public class Counter {
    private int startValue;
  
    public Counter(int startValue) {
        this.startValue = startValue;
    }
    
    public Counter() {
        this(0);
    }
    
    public int value() {
        return startValue;
    } 
    
    public void increase() {
        this.increase(1);
    }
    
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
        this.startValue = startValue + increaseBy;
        }
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
        this.startValue = startValue - decreaseBy;
        }
    }   
}
