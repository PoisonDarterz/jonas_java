import java.util.Scanner;
import java.text.DecimalFormat;


public class pal0603 {
    public static void main(String[] args) {
        double x = (3+1)*3%5-4;
        boolean y = (5%2)>=0&&x<0;
        System.out.println(y);
    }
}

class pal1203 {
    public static void main(String[] args) {
        Scanner jonas = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("-----------------Personal Information-----------------");
        System.out.print("Name: ");
            String name = jonas.nextLine();
        System.out.print("Matric No: ");
            String matno = jonas.nextLine();
        System.out.print("IC No: ");
            String icno = jonas.nextLine();
        
        System.out.println("----------------------Marks Input:--------------------");
        System.out.print("SC025: ");
            int sc = jonas.nextInt();
        System.out.print("SP025: ");
            int sp = jonas.nextInt();
        System.out.print("SK025: ");
            int sk = jonas.nextInt();
        System.out.print("SM025: ");
            int sm = jonas.nextInt();

        String gradesc,gradesp,gradesk,gradesm;
        double gpasc,gpasp,gpask,gpasm;
        
            //computer science
            if(sc>=85){
                gradesc = "A"; gpasc = 4.00;
            } else if(sc>=75){
                gradesc = "A-"; gpasc = 3.67;
            } else if(sc>=70){
                gradesc = "B+"; gpasc = 3.33;
            } else if(sc>=65){
                gradesc = "B"; gpasc = 3.00;
            } else if(sc>=60){
                gradesc = "B-"; gpasc = 2.67;
            } else if(sc>=50){
                gradesc = "C+"; gpasc = 2.33;
            } else if(sc>=40){
                gradesc = "C"; gpasc = 2.00;
            } else if(sc>=30){
                gradesc = "C-"; gpasc = 1.67;
            } else if(sc>=20){
                gradesc = "D+"; gpasc = 1.33;
            } else if(sc>=10){
                gradesc = "D"; gpasc = 1.00;
            } else{
                gradesc = "F"; gpasc = 0.00;
            }

            //physics
            if(sp>=85){
                gradesp = "A"; gpasp = 4.00;
            } else if(sp>=75){
                gradesp = "A-"; gpasp = 3.67;
            } else if(sp>=70){
                gradesp = "B+"; gpasp = 3.33;
            } else if(sp>=65){
                gradesp = "B"; gpasp = 3.00;
            } else if(sp>=60){
                gradesp = "B-"; gpasp = 2.67;
            } else if(sp>=50){
                gradesp = "C+"; gpasp = 2.33;
            } else if(sp>=40){
                gradesp = "C"; gpasp = 2.00;
            } else if(sp>=30){
                gradesp = "C-"; gpasp = 1.67;
            } else if(sp>=20){
                gradesp = "D+"; gpasp = 1.33;
            } else if(sp>=10){
                gradesp = "D"; gpasp = 1.00;
            } else{
                gradesp = "F"; gpasp = 0.00;
            }


            //chemistry
            if(sk>=85){
                gradesk = "A"; gpask = 4.00;
            } else if(sk>=75){
                gradesk = "A-"; gpask = 3.67;
            } else if(sk>=70){
                gradesk = "B+"; gpask = 3.33;
            } else if(sk>=65){
                gradesk = "B"; gpask = 3.00;
            } else if(sk>=60){
                gradesk = "B-"; gpask = 2.67;
            } else if(sk>=50){
                gradesk = "C+"; gpask = 2.33;
            } else if(sk>=40){
                gradesk = "C"; gpask = 2.00;
            } else if(sk>=30){
                gradesk = "C-"; gpask = 1.67;
            } else if(sk>=20){
                gradesk = "D+"; gpask = 1.33;
            } else if(sk>=10){
                gradesk = "D"; gpask = 1.00;
            } else{
                gradesk = "F"; gpask = 0.00;
            }


            //maths
            if(sm>=85){
                gradesm = "A"; gpasm = 4.00;
            } else if(sm>=75){
                gradesm = "A-"; gpasm = 3.67;
            } else if(sm>=70){
                gradesm = "B+"; gpasm = 3.33;
            } else if(sm>=65){
                gradesm = "B"; gpasm = 3.00;
            } else if(sm>=60){
                gradesm = "B-"; gpasm = 2.67;
            } else if(sm>=50){
                gradesm = "C+"; gpasm = 2.33;
            } else if(sm>=40){
                gradesm = "C"; gpasm = 2.00;
            } else if(sm>=30){
                gradesm = "C-"; gpasm = 1.67;
            } else if(sm>=20){
                gradesm = "D+"; gpasm = 1.33;
            } else if(sm>=10){
                gradesm = "D"; gpasm = 1.00;
            } else{
                gradesm = "F"; gpasm = 0.00;
            }
            


        System.out.println("----------------------Grades:-------------------");
        System.out.println("SC025: " + gradesc + " (" + df.format(gpasc) + ")");
        System.out.println("SP025: " + gradesp + " (" + df.format(gpasp) + ")");
        System.out.println("SK025: " + gradesk + " (" + df.format(gpask) + ")");
        System.out.println("SM025: " + gradesm + " (" + df.format(gpasm) + ")");

            double cgpa = (gpasc + gpasp + gpask + gpasm) /4;

            String status;
            if(cgpa>=2.00){
                status = "Pass";
            } else if (cgpa >=1.50) {
                status = "Fail and Offer to repeat the year.";
            } else {
                status = "Fail";
            }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("-----------------Final Grade:-------------------");
        System.out.println("Name: " + name);
        System.out.println("Matric No: " + matno);
        System.out.println("IC No: " + icno);
        System.out.println("CGPA: " + df.format(cgpa));
        System.out.println("Status: " + status);
    }
}




class practeststyle{
    public static void main(String[] args) {

        Scanner jonas = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("-----------------Personal Information-----------------");
        System.out.print("Name: ");
            String name = jonas.nextLine();
        System.out.print("Matric No: ");
            String matno = jonas.nextLine();
        System.out.print("IC No: ");
            String icno = jonas.nextLine();
        
        System.out.println("----------------------Marks Input:--------------------");
        System.out.print("SC025: ");
            int sc = jonas.nextInt();


        String gradesc;
        double gpasc;
        
        //computer science
        if(sc>=85){
            gradesc = "A"; gpasc = 4.00;
        } else if(sc>=75){
            gradesc = "A-"; gpasc = 3.67;
        } else if(sc>=70){
            gradesc = "B+"; gpasc = 3.33;
        } else if(sc>=65){
            gradesc = "B"; gpasc = 3.00;
        } else if(sc>=60){
            gradesc = "B-"; gpasc = 2.67;
        } else if(sc>=50){
            gradesc = "C+"; gpasc = 2.33;
        } else if(sc>=40){
            gradesc = "C"; gpasc = 2.00;
        } else if(sc>=30){
            gradesc = "C-"; gpasc = 1.67;
        } else if(sc>=20){
            gradesc = "D+"; gpasc = 1.33;
        } else if(sc>=10){
            gradesc = "D"; gpasc = 1.00;
        } else{
            gradesc = "F"; gpasc = 0.00;
        }

        //final output
    }
}