package com.kodnest.arraysmethods;
import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user for the array size
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();

	        // Ask the user to enter the elements of the array
	        int[] array = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        scanner.close();

	        System.out.println("Original array: " + Arrays.toString(array));

	        // Reverse the array
	        int[] reversedArray = reverseArray(array);

	        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
	    }

	    public static int[] reverseArray(int[] arr) {
	        int length = arr.length;
	        int[] reversedArray = new int[length];

	        for (int i = 0; i < length; i++) {
	            reversedArray[i] = arr[length - 1 - i];
	        }

	        return reversedArray;
	    }
	}