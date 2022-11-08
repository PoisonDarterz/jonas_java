import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String x, lower;
        // char arr[];

        // for (int i = 0; i < 2; i++){
        //     x = sc.nextLine();
        //     lower = x.toLowerCase();
        //     arr = lower.toCharArray();
        //     Arrays.sort(arr);
        //     System.out.println(arr);
        // }
        int year;
        while (true){
            year = sc.nextInt();
            boolean leap = ( (year % 4 == 0 && year % 100 !=0) || year % 400 == 0) ? true : false;
            System.out.println(leap);
        }

        
    }
}