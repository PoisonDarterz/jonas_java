/*Jonas
* no1,2,5
*/

import java.util.Scanner;

class q41_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();

            if(num>0){
                System.out.println("The number is positive");
            } else {
                System.out.println("The number is negative");
            }
    }
}

class q41_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input marks: ");
        int marks = input.nextInt();

            if(marks>=90){
                System.out.println("Grade: A");
            }
    }
}

class q41_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bmi=0.0;

        System.out.print("Input weight in kg: ");
            double weight = input.nextDouble();
        System.out.print("Input height in metres: ");
            double height = input.nextDouble();

        if(weight!=0 && height!=0){
            bmi = weight / height / height;
        } else {
            System.out.println("The input entered is invalid.");
            System.exit(0);
        }

        System.out.println("Your BMI is: " + bmi);
    }
}