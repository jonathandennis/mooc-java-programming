
public class PaymentTerminal {
    
    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTY_PRICE = 4.3;

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        
        if (payment < AFFORDABLE_PRICE) {
            return payment;
        }
        
        this.money += AFFORDABLE_PRICE;
        this.affordableMeals++;
        return payment - AFFORDABLE_PRICE;
    }

    public double eatHeartily(double payment) {
        
        if (payment < HEARTY_PRICE) {
            return payment;
        }
        
        this.money += HEARTY_PRICE;
        this.heartyMeals++;
        return payment - HEARTY_PRICE;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        
        if (card.balance() < AFFORDABLE_PRICE) {
            return false;
        }
        card.takeMoney(AFFORDABLE_PRICE);
        affordableMeals++;
        return true;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        
        if (card.balance() < HEARTY_PRICE) {
            return false;
        }
        card.takeMoney(HEARTY_PRICE);
        heartyMeals++;
        return true;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }
        card.addMoney(sum);
        this.money += sum;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
