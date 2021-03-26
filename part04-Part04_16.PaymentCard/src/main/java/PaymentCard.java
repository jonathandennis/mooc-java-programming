/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathandennis
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }
    
    public void eatAffordably() {
        if (balance < 2.60) {
        
        } else {
            balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        if (balance < 4.60) {
        
        } else {
            balance -= 4.60;
        }
    }
    
    public void addMoney(double money) {
        
        if (money < 0) {
            
        } else if (balance + money > 150.0) {
            double difference = (150.0 - balance);
            balance += difference;
        } else {
            balance += money;
        }
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
