/* 
Jonas Chuan
F1T4

Classes are name according to the format:
qNS_Q, where
N = topic
S = Subtopic
Q = Question number
*/

import java.util.Scanner;

class q22_1 {
    public static void main(String[] args) {
        double x = 25 + 15 * 3 - (10/(2*6)) + ((9%6)/3) + 1;
        System.out.println(x);
    }
}


class q22_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double celsius = input.nextDouble();

            double faren = celsius*9/5 + 32;

        System.out.println("Value of temperature is: " + faren + " Farenheit");
    }
}

class q22_3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length in feet: ");
        double feet = input.nextDouble();

            double meter = feet * 0.305;

        System.out.println("Value of length is: " + meter + " meters");
    }
}

class q22_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input 3 numbers, store in array
        int[] array = new int[3];
        int j;
        for(j=0;j<3;j++){
            System.out.println("Input numbers " + (j+1)  + ":");
            array[j]= sc.nextInt();
        }

            //calculation of total of 3 numbers, then calculate average
            double total = 0.0;
            for (int i=0; i<array.length; i++){
                total = total + array[i];
            }

            double avg = total / array.length;

        //output
        System.out.println("The average value is: " + avg);
    }
}

/*
question 5:

a) false
b) false true
c) 2 
*/