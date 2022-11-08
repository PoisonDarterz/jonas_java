/*Jonas
* no1-5
*/

import java.util.Scanner;

class q42_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status = false;

        System.out.print("Input a number: ");
        int num = input.nextInt();

            if(num>0){
                status = true;
            }

        if(status){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}

class q42_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fine=0;

        System.out.print("Input speed: ");
        int speed = input.nextInt();

            if(speed>110){
                fine = 300;
            }

        System.out.println("Your fine is: " + fine);
    }
}

class q42_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = 10;

        System.out.print("Enter age: ");
        int age = input.nextInt();

            if(age<55){
                price = 20;
            }

        System.out.println("The ticket price is : RM" + price);
    }
}

class q42_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pay=0;

        System.out.print("Enter hours: ");
        int hour = input.nextInt();

        if(hour<=40){
            pay = 9 * hour;
        } else {
            pay = 9*40 + 13.5*(hour-40);
        }

        System.out.println("Total pay is: " + pay);
    }
}

class q42_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=0;
        boolean triangle = false;

        System.out.print("Enter angle: ");
        int angle1 = input.nextInt();
        System.out.print("Enter angle: ");
        int angle2 = input.nextInt();
        System.out.print("Enter angle: ");
        int angle3 = input.nextInt();

            total = angle1 + angle2 + angle3;

            if (total == 180){
                triangle = true;
            }

        if(triangle){
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is invalid.");
        }
    }
}