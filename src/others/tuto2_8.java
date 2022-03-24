package others;
/* Jonas Chuan
F1T4 */

import java.util.Scanner;

class tutoq28_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        int num;

            do{
                System.out.println("Input number " + (i+1));
                num = sc.nextInt();

                    if(num>=0){
                        sum = sum + num;
                    }

                i = i+1;
            }while((num>=0) && (i<20));
        
        System.out.println("Sum of numbers inputted is:" + sum);

    }
}
