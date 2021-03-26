

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    } 
    public static void printFromNumberToOne(int number) {
        int numberToPrint = number;
        
        while (numberToPrint > 0) {
            System.out.println(numberToPrint);
            numberToPrint--;
        }
    }
}
