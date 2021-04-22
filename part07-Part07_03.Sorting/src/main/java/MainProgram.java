
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {-1, 6, 9, 8, 12};
        //System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of smallest: " + MainProgram.indexOfSmallest(numbers));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        int index = 0;
            
        while (index < array.length) {
            if (smallest > array[index]) {
                smallest = array[index];
            }
            index++;
        }
        return smallest;           
    }
    
    public static int indexOfSmallest(int[] array) {
        int indexOf = 0;
        int index = 0;
        while (index < array.length) {
            if (array[index] == smallest(array)) {
                indexOf = index;
            }           
            index++;
        }
        return indexOf;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestFrom = table[startIndex];
        int indexOf = startIndex;
        int index = startIndex;
        while (index < table.length) {
            if (smallestFrom > table[index]) {
                indexOf = index;
                smallestFrom = table[index];
            }
            index++;
        }
        return indexOf;
    }
} 
