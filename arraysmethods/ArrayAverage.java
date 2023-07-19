package com.kodnest.arraysmethods;
import java.util.Scanner;
public class ArrayAverage{// size of the array
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the size of the array: ");
     int n = scanner.nextInt();

     int[] numbers = new int[n];

     System.out.println("Enter " + n+ " integers:");
     for (int i = 0; i < n; i++) {
         numbers[i] = scanner.nextInt();
     }

     System.out.println("Array length: " + numbers.length);

     scanner.close();
 }
}
	

