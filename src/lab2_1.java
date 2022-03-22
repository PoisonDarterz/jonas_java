/* Jonas Chuan
   F1T4 */


import java.util.Scanner;

class lab2_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); //init scanner

            //obtain data
            System.out.print("Enter student name: ");
            String name=input.nextLine();

            System.out.print("Enter the degree name: ");
            String degree=input.nextLine();

            System.out.print("Enter the number of credits required for the degree: ");
            int credit=input.nextInt();

            System.out.print("Enter the number of credits taken so far: ");
            int taken=input.nextInt();

                //calculate remainder of credits left
                int remainder=credit-taken;

        //output
        System.out.println("\nThe student\'s name is " + name);
        System.out.println("The degree name is " + degree);
        System.out.println("There are " + remainder + " credits left until graduation.");
    }
}

class lab2_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); //init scanner

            //collect data and instant feedback
            System.out.print("Please enter your name: ");
            String name=input.nextLine();

            System.out.print("Hello " + name + ", Welcome to SC025!!!\n" + name + " how old are you?");
            int age = input.nextInt();

            //final output
            System.out.println("Your name: "+name);
            System.out.println("Your age:"+age);
    }
}


