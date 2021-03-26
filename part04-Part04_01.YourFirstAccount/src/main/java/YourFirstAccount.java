
public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account jonsAccount = new Account("Jon's account", 100.00);
        
        jonsAccount.deposit(20);
        
        System.out.println(jonsAccount);
    }
}
