
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {-1, 6, 9, 8, 12};
        //System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of smallest: " + MainProgram.indexOfSmallest(numbers));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
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
        int indexOfSmallest = 0;
        int index = 0;
        while (index < array.length) {
            if (array[index] < array[indexOfSmallest]) {
                indexOfSmallest = index;
            }           
            index++;
        }
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        
        int index = startIndex;
        while (index < array.length) {
            if (array[index] < array[indexOfSmallest]) {
                indexOfSmallest = index;
            }
            index++;
        }
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length - 1) {
            System.out.println(Arrays.toString(array));
            
            int smallestInt = indexOfSmallestFrom(array, index);
            swap(array, index, smallestInt);
            index++;
        }
    }
} 
