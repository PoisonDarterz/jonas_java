package others;

import java.util.Random;

public class testcode2 {
    static int[] arr = new int[10];
    static Random rng = new Random();

    static void fillArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rng.nextInt(101);
        }
    }
    
    public static void main(String[] args) {
        
    }
}
