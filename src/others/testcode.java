package others;

import java.util.Random;

public class testcode {
    public static void main(String[] args) {
        Random rand = new Random();
        // int[][] arr = new int[4][5];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j] = rand.nextInt(101);
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.printf("%3d ", arr[i][j]);
        //     }
        //     System.out.println();
        // }
        // double x = 1;
        // double y = 25;
        // double sum = 0;
        // while (x <= 25) {
        // 	sum += (x/y);
        // 	x++;
        // 	y--;
        // }
        // System.out.printf("The sum is %.2f", sum);

        // int x = 1, y = 0, temp;
        // while (x < 1000) {
	    //     System.out.print(x + " ");
	    //     temp = x;
	    //     x += y;
	    //     y = temp;
        // }

        // String x = "Hello World!";
        // char[] arr = x.toCharArray();
        // for (int j = arr.length-1; j >= 0; j--){
	    //     System.out.print(arr[j]);
        // }

        // int[] marks = new int[5];
        // int i = 0, j = 1;
        // marks[i] = 12;
        // marks[j] = marks[i] + 19;
        // marks[j-1] = marks[j] * marks [j];
        // marks[j*3] = marks[i+1];
        // marks[++j] = marks[i]%5;
        // marks[2*j] = marks[j-1];
        // System.out.println(marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " " + marks[4]);

        // String[] sentence = {"Hello world!", "Byebye Holland!"};
        // for (int i=sentence.length-1; i>=0; i--) {
        //  for (int j = sentence[i].length()-1; j>=0; j--) {
        //     System.out.print(sentence[i].charAt(j));
        //  }
        //  System.out.print(" ");
        // }

        int x = rand.nextInt(256);
        String b = Integer.toBinaryString(x);
        String output = String.format("%8s", b).replaceAll(" ", "0");
        System.out.printf("%s", output);
    }
}
