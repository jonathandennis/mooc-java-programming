import java.lang.Math;

public class BinaryGap {

    public static void main(String[] args) {       
        int N = 32;       
        System.out.println("Binary is: " + Integer.toBinaryString(N));
        
        String binaryRep = Integer.toBinaryString(N);
        
        int maxGap = 0;
        int gap = 0;
        
        for(int i = 0; i < binaryRep.length(); i++) {
            
            if (binaryRep.charAt(i) == '1') {
                if (gap > maxGap) {
                    maxGap = gap;
                }
                gap = 0;
            } else {
                gap++;
            }
        }
        
        System.out.println("Max gap: " + maxGap);   
    }
}