package others;
import java.util.Scanner;

class tuto72_3 {
    public static void main(String[] args) {
        tuto72_3 obj = new tuto72_3();
        Scanner sc = new Scanner(System.in);

        System.out.print("Input subtotal: ");
            double subttl = sc.nextDouble();

        double taxamt = obj.tax(subttl); //answer: 3c
        System.out.println("Resulting tax amount: " + taxamt);
    }

    double tax(double subtot){ // answer: 3a
        //answer: 3b
        double amount = subtot * 0.55;
        return amount;
    }
}


class tuto72_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tuto72_4 obj = new tuto72_4();

        System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            double area = obj.Area(radius);
            double circ = obj.Circ(radius);
    }

    double Area(double rad){
        return (3.1416 * rad * rad);
    }
    double Circ(double rad){
        return (3.1416 * 2 * rad);
    }
}


class tuto72_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tuto72_5 obj = new tuto72_5();

        System.out.print("Enter integer: ");
            int num1 = sc.nextInt();
        System.out.print("Enter integer: ");
            int num2 = sc.nextInt();

            int sum = obj.Add(num1, num2);
            System.out.println("The sum is: " + sum);
            //
            obj.Mul(num1, num2);
    }

    int Add (int x,int y){
        int z = x+y;
        return z;
    }
    void Mul (int x,int y){
        System.out.println("The product is: " + (x*y));
    }
}

class tuto72_6{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        tuto72_6 obj = new tuto72_6();

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