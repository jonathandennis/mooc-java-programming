
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int start = 0;
        while (start < number) {
            System.out.print("*");
            start++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int start = 0;
        
        while (start < size) {
            printStars(size);
            start++;
        }   
    }

    public static void printRectangle(int width, int height) {
        int start = 0;
        
        while (start < height) {
            printStars(width);
            start++;
        }
    }

    public static void printTriangle(int size) {
        int max = 1;
        
        while (max <= size) {
            printStars(max);
            max++;
        }
         
        
    }
}
