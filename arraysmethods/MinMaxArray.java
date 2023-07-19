package com.kodnest.arraysmethods;
import java.util.Scanner;
public class MinMaxArray {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user for the array size
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Ask the user to enter the elements of the array
	        int[] array = new int[size];
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        scanner.close();

	        // Find the minimum and maximum numbers in the array
	        int min = array[0];
	        int max = array[0];

	        for (int i = 1; i < size; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }

	        // Print the result
	        System.out.println("Minimum number: " + min);
	        System.out.println("Maximum number: " + max);
	    }
	}
