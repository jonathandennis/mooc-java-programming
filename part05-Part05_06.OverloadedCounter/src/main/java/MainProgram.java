
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter();
        
        counter.increase(-2);
        counter.increase();
        counter.increase(5);
        counter.decrease();
        counter.decrease(2);

        System.out.println("Value: " + counter.value());
    }
}
