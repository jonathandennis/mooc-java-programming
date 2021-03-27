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
    
    // let's store the prices of affordable and hearty meals as variables,
    // which makes the code clearer to read
    // the keyword final means that the value of the variable cannot be modified
    // after it has been set for the first time
    private final double affordable;
    private final double hearty;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordable = 2.6;
        this.hearty = 4.6;    
    }
    
    public void eatAffordably() {
        if (this.balance >= affordable) {
            this.balance -= affordable;
        }
    }
    
    public void eatHeartily() {
        if (this.balance >= hearty) {
            this.balance -= hearty;
        }
    }
    
    public void addMoney(double amount) {
        
        if (amount < 0) {
            return;
        }
        
        if (this.balance + amount > 150.0) {
            double difference = (150.0 - balance);
            balance += difference;
        } else {
            balance += amount;
        }
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
