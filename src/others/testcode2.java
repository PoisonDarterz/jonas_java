package others;

import java.util.Random;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;


public class testcode2 {
    // static int[] arr = new int[];
    // static Random rng = new Random();

    // static void fillArray() {
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = rng.nextInt(101);
    //     }
    // }
    
    // public static void main(String[] args) {
    //     int ok = 10;
    //     for  (int i = 0 ; i < 10; i+ +){
    //         System.out.println(i);
    //     }
    // }



public static void main(String[] args) {
	String binStr="";
	StringBuilder result = new StringBuilder();
	
    String sentence = "Hello World!";
	char[] arr = sentence.toCharArray();
	for (char x : arr){
        result.append(String.format("%8s",Integer.toBinaryString(x)).replaceAll(" ", "0"));
        result.append(" ");
	}
    binStr = result.toString();

	try {
		PrintWriter pw = new PrintWriter(new FileOutputStream("data.txt"));
		pw.print(binStr);
		pw.close();
	} catch (IOException e) {
	    System.out.println("Error: " + e);
    }

    try {
	    Scanner sc = new Scanner(new FileInputStream("data.txt"));
	    String input, raw ="";
	    while (sc.hasNext()){
			input = sc.next();
            raw += Arrays.stream(input.split(" "))
            .map(binary -> Integer.parseInt(binary, 2))
            .map(Character::toString)
            .collect(Collectors.joining());
	    }
        System.out.println(raw);
        sc.close();
    } catch (FileNotFoundException e) {
		System.out.println("Error: " + e);
    } catch (IOException e) {
		System.out.println("Error: " + e);
    }
}
}
