//Jonas
//q1, 2, 4, 6 and 7.2 q1

import java.util.Scanner;
import java.text.DecimalFormat;

class q71_1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        q71_1 obj = new q71_1();
        int[] nums = new int[2];

        nums = obj.getInput();
        int sum = obj.getSum(nums);
        obj.output(sum);
    }

    int[] getInput(){
        int[] nums = new int[2];
        for(int i=0; i<2; i++){
            System.out.print("Enter integer number: ");
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    int getSum(int[] nums){
        int sum=0;
        for(int i=0; i<2; i++){
            sum = sum + nums[i];
        }
        return sum;
    }

    void output(int sum){
        System.out.println("The sum of the 2 integers is: " + sum);
    }
}


class q71_2{
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");
    public static void main(String[] args) {
        q71_2 obj = new q71_2();

        double width = obj.getWidth();
        double length = obj.getLength();
        double circum = obj.getCirc(width,length);
        double area = obj.getArea(width,length);
        obj.output(circum,area);
    }

    double getWidth(){
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        return width;
    }

    double getLength(){
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        return length;
    }

    double getCirc(double w, double l){
        double circ = 2*w + 2*l;
        return circ;
    }

    double getArea(double w, double l){
        double area = w*l;
        return area;
    }

    void output(double c, double a){
        String dfc = df.format(c);
        String dfa = df.format(a);
        System.out.println("The circumference is: " + dfc);
        System.out.println("The area is: " + dfa);
    }
}


class q71_4{
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");
    public static void main(String[] args) {
        q71_4 obj = new q71_4();

        System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            double area = obj.Area(radius);
            double circ = obj.Circ(radius);
            obj.output(area,circ);
    }

    double Area(double rad){
        return (3.1416 * rad * rad);
    }

    double Circ(double rad){
        return (3.1416 * 2 * rad);
    }

    void output(double c, double a){
        String dfc = df.format(c);
        String dfa = df.format(a);
        System.out.println("The circumference is: " + dfc);
        System.out.println("The area is: " + dfa);
    }
}


class q71_6{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        q71_6 obj = new q71_6();

        System.out.println("Enter sales amount so far: ");
            double oriamt = sc.nextDouble(); 
            double salesamt = obj.getSales(oriamt);

        System.out.println("Updated sales figure is: " + salesamt);
    }

    double getSales(double ori){
        System.out.print("Enter number of videos rented today: ");
        int numvid = sc.nextInt();
        double amt = numvid * 4.25;
        return (ori + amt);
    }
}


class q72_1{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        q72_1 obj = new q72_1();
        int age = obj.getAge();
        boolean eligib = obj.check(age);
        obj.output(eligib);
    }

    int getAge(){
        System.out.print("Enter age: ");
        return sc.nextInt();
    }

    boolean check(int a){
        if(a>=18){
            return true;
        } else {
            return false;
        }
    }

    void output(boolean e){
        if(e){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}